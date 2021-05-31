/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MOKLET-2
 */
class ID extends Identitas{
    private String noID;
    
    public ID (String noID, String nama, int usia)
            
    {
        super(nama, usia);
        this.noID = noID;
        
    }
    
    public void info ()
    {
        System.out.println("No. ID Card: "+this.noID);
        super.info();
    }
}
