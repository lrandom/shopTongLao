/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dals;

import java.util.ArrayList;
import models.Model;

/**
 *
 * @author Lrandom
 */
public interface IDal {
     public ArrayList<? extends Model> getAll();
     public Model getOne();
   
}
