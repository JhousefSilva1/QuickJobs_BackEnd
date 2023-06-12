package bo.edu.ucb.quickjobs.quickjobs.serviceImpl;

import bo.edu.ucb.quickjobs.quickjobs.dto.CommentDTO;
import bo.edu.ucb.quickjobs.quickjobs.entity.Comment;
import bo.edu.ucb.quickjobs.quickjobs.entity.Publication;
import bo.edu.ucb.quickjobs.quickjobs.exceptions.BlogAppException;
import bo.edu.ucb.quickjobs.quickjobs.exceptions.ResourceNotFoundException;
import bo.edu.ucb.quickjobs.quickjobs.repository.CommentRepository;
import bo.edu.ucb.quickjobs.quickjobs.repository.PublicationRepository;
import bo.edu.ucb.quickjobs.quickjobs.service.CommentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private PublicationRepository publicationRepository;

    @Override
    public CommentDTO addComment(long publicationId, CommentDTO commentDTO) {
        Comment comment = mapperEntity(commentDTO);
        Publication publication = publicationRepository.findById(publicationId).orElseThrow(()-> new ResourceNotFoundException("Publication", "id", publicationId));
        comment.setPublication(publication);
        Comment newComment = commentRepository.save(comment);
        return mapperDTO(newComment);
    }

    @Override
    public List<CommentDTO> getCommentsByPublicationId(long publicationId) {
        List<Comment> comments = commentRepository.findByPublicationId(publicationId);
        return  comments.stream().map(comment -> mapperDTO(comment)).collect(Collectors.toList());
    }

    @Override
    public CommentDTO getCommentById(Long publicationId, Long commentId) {
        Publication publication = publicationRepository.findById(publicationId).orElseThrow(()-> new ResourceNotFoundException("Publication", "id", publicationId));
        Comment comment = commentRepository.findById(commentId).orElseThrow(()-> new ResourceNotFoundException("Comment", "id", commentId));
        if(!comment.getPublication().getId().equals(publication.getId())){
            throw new BlogAppException(HttpStatus.BAD_REQUEST, "El comentario no pertenece a la publicacion");
        }
        return mapperDTO(comment);
    }

    @Override
    public CommentDTO updateComment(Long publicationId, Long commentId, CommentDTO commentRequest) {
        Publication publication = publicationRepository.findById(publicationId).orElseThrow(()-> new ResourceNotFoundException("Publication", "id", publicationId));
        Comment comment = commentRepository.findById(commentId).orElseThrow(()-> new ResourceNotFoundException("Comment", "id", commentId));
        if(!comment.getPublication().getId().equals(publication.getId())){
            throw new BlogAppException(HttpStatus.BAD_REQUEST, "El comentario no pertenece a la publicacion");
        }
        comment.setName(commentRequest.getName());
        comment.setBody(commentRequest.getBody());
        comment.setEmail(commentRequest.getEmail());

        Comment commentUpdated = commentRepository.save(comment);
        return mapperDTO(commentUpdated);
    }

    @Override
    public void deleteComment(Long publicationId, Long commentId) {
        Publication publication = publicationRepository.findById(publicationId).orElseThrow(() -> new ResourceNotFoundException("Publication", "id", publicationId));

        Comment comment = commentRepository.findById(commentId).orElseThrow(() -> new ResourceNotFoundException("Comment", "id", commentId));

        if(!comment.getPublication().getId().equals(publication.getId())) {
            throw new BlogAppException(HttpStatus.BAD_REQUEST, "El comentario no pertenece a la publicación");
        }

        commentRepository.delete(comment);
    }

    private  CommentDTO mapperDTO(Comment comment){
        CommentDTO commentDTO = modelMapper.map(comment, CommentDTO.class);
        return commentDTO;
    }

    private Comment mapperEntity(CommentDTO commentDTO){
        Comment comment = modelMapper.map(commentDTO, Comment.class);
        return  comment;
    }
}
