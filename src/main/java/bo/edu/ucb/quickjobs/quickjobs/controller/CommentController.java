package bo.edu.ucb.quickjobs.quickjobs.controller;

import bo.edu.ucb.quickjobs.quickjobs.dto.CommentDTO;
import bo.edu.ucb.quickjobs.quickjobs.service.CommentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @GetMapping("/publication/{publicationId}/comments")
    public List<CommentDTO> getCommentsByPublicationId(@PathVariable(value = "publicationId") long publicationId){
        return commentService.getCommentsByPublicationId(publicationId);
    }

    @GetMapping("/publication/{publicationId}/comments/{id}")
    public ResponseEntity<CommentDTO> getCommentsById(@PathVariable(value = "publicationId") Long publicationId,@PathVariable(value = "id") Long commentId){
        CommentDTO commentDTO = commentService.getCommentById(publicationId, commentId);
        return new ResponseEntity<>(commentDTO,HttpStatus.OK);
    }

    @PostMapping("/publication/{publicationId}/comments")
    public ResponseEntity<CommentDTO> addComment(@PathVariable(value = "publicationId") long publicationId, @Valid @RequestBody CommentDTO commentDTO){
        return new ResponseEntity<>(commentService.addComment(publicationId, commentDTO), HttpStatus.CREATED);
    }

    @PutMapping("/publication/{publicationId}/comments/{id}")
    public ResponseEntity<CommentDTO> updateComment(@PathVariable(value = "publicationId") Long publicationId,@PathVariable(value = "id") Long commentId, @Valid @RequestBody CommentDTO commentDTO){
        CommentDTO commentUpdated = commentService.updateComment(publicationId, commentId, commentDTO);
        return new ResponseEntity<>(commentUpdated,HttpStatus.OK);
    }

//    @DeleteMapping("/publicaciones/{publicacionId}/comentarios/{id}")
//    public ResponseEntity<String> eliminarComentario(@PathVariable(value = "publicacionId") Long publicacionId,@PathVariable(value = "id") Long comentarioId){
//        commentService.deleteComment(publicacionId, comentarioId);
//        return new ResponseEntity<>("Comentario eliminado con exito",HttpStatus.OK);
//    }
}
