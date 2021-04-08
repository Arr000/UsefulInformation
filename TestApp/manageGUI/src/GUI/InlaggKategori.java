/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author nene5
 */
public class InlaggKategori {
    
    private int Id;
    private String inlagg;
    private String kategori;
    
    
    public InlaggKategori(int id, String inlagg, String kategori)
    {
        this.Id = id;
        this.inlagg = inlagg;
        this.kategori = kategori;
    }
    
    public int getId()
    {
        return this.Id;
    }
    
    public String getInlagg()
    {
        return this.inlagg;
    }
    
    public String getKategori()
    {
        return this.kategori;
    }
}
