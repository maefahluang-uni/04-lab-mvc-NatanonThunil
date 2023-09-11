package th.mfu;

import java.util.Date;

public class Concert {

    //TODO: add attributes
    private String title;
    private String description;
    private Date date;
    private long id;
    private String performer;

    public Concert() {
    }
    public Concert(String title, String description) {
        //TODO: set attributes
        this.title = title;
        this.description = description;

    }
 
    public String getTitle() {
        //TODO: return title
        return title;
    }
    public String getDescription() {
        //TODO: return description
        return description;
    }
    public Date getDate(){
        return date;
    }

    public long getId() {
        return id;
    }

    public String getPerformer() {
        return performer;
    }

    //TODO: add getters and setters

     public void setTitle(String title) {
        this.title = title;
     }

     public void setDescription(String description){
        this.description = description;
     }
     
     public void setDate(Date date){
        this.date = date ;
     }
     public void setId(long id){
        this.id = id ;
     }
     public void setPerformer(String performer){
        this.performer=performer;
     }
}
