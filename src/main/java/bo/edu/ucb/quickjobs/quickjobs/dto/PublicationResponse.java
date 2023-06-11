package bo.edu.ucb.quickjobs.quickjobs.dto;

import java.util.List;

public class PublicationResponse {
    private List<PublicationDTO> content;
    private int numberPage;
    private int sizePage;
    private long totalElements;
    private int totalPages;
    private boolean last;

    public List<PublicationDTO> getContent() {
        return content;
    }

    public void setContent(List<PublicationDTO> content) {
        this.content = content;
    }

    public int getNumberPage() {
        return numberPage;
    }

    public void setNumberPage(int numberPage) {
        this.numberPage = numberPage;
    }

    public int getSizePage() {
        return sizePage;
    }

    public void setSizePage(int sizePage) {
        this.sizePage = sizePage;
    }

    public long getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(long totalElements) {
        this.totalElements = totalElements;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public boolean isLast() {
        return last;
    }

    public void setLast(boolean last) {
        this.last = last;
    }

    public PublicationResponse() {
        super();
    }
}
