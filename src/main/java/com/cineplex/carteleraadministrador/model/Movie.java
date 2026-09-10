package main.java.com.cineplex.carteleraadministrador.model;

/**
 *
 * @author dbarrientos
 */
public class Movie {
    
    private int id_movie;
    private String title;
    private String url_poster;
    
    
    public Movie(){
        
    }
    
    public Movie(int id_movie, String title, String url_poster) {
        this.id_movie = id_movie;
        this.title = title;
        this.url_poster = url_poster;
    }

    public int getId_movie() {
        return id_movie;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl_poster() {
        return url_poster;
    }

    public void setId_movie(int id_movie) {
        this.id_movie = id_movie;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUrl_poster(String url_poster) {
        this.url_poster = url_poster;
    }
    
    
    
}
