/**
 * Store the details of a music track,
 * such as the artist, title, and file name.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
 */
public class Track
{
    // The artist.
    private String artist;
    // The track's title.
    private String title;
    // Where the track is stored.
    private String filename;
    //Cuenta las reproducciones de una cancion
    private int playCount;
    // A�o de la cancion
    private int anio;
    
    /**
     * Constructor for objects of class Track.
     * @param artist The track's artist.
     * @param title The track's title.
     * @param filename The track file. 
     */
    public Track(String artist, String title, String filename,int anio)
    {
        setDetails(artist, title, filename,anio);
        playCount =0;
    }
    
    /**
     * Constructor for objects of class Track.
     * It is assumed that the file name cannot be
     * decoded to extract artist and title details.
     * @param filename The track file. 
     */
    
    /** 
     * metodo para resetar el contador de reproducciones de un track
     */
    public void resertCount()
    {
        playCount=0;
    }
    
    /**
     * Metodo que incrementa en uno el contador
     */
    public void incrementaContador()
    {
        playCount++;
    }
    
    public Track(String filename)
    {
        setDetails("unknown", "unknown", filename , 0);
    }
    
    /**
     * Return the artist.
     * @return The artist.
     */
    
    public String getArtist()
    {
        return artist;
    }
    /**
     * Mtodo que devuelve el a�o
     */
    
    public int getAnio()
    {
        return anio;
    }
     /** Return the title.
     * @return The title.
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * Return the file name.
     * @return The file name.
     */
    public String getFilename()
    {
        return filename;
    }
        
    /**
     * Return details of the track: artist, title and file name.
     * @return The track's details.
     */
    public String getDetails()
    {
        return artist + ": " + title + "  (file: " + filename + " Reproducciones: " + playCount + "A�o: " + anio + ")";
    }
    
    /**
     * Set details of the track.
     * @param artist The track's artist.
     * @param title The track's title.
     * @param filename The track file. 
     */
    private void setDetails(String artist, String title, String filename , int anio)
    {
        this.artist = artist;
        this.title = title;
        this.filename = filename;
        this.anio = anio;
    }
    
}
