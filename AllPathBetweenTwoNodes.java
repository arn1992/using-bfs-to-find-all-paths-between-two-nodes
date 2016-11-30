/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allpathbetweentwonodes;

/**
 *
 * @author arn
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.InputStreamReader;
import java.util.*;
 
class AllPathBetweenTwoNodes{
     static int dim = 20;
 
    
    static boolean[] color = new boolean[dim + 1];
     
    
    static int[][] graph = new int[21][21];
     
    
    static ArrayList<Object> list = new ArrayList<Object>(); 
     static String a[]=new String[21];
     
    // this is the size of "list" declared above
    // size is used to remember index of the node in the list to be removed
    // when  the node is marked unvisited
    static int size;
     
    public static void main (String[] args) throws IOException{
     
       int m=26;
        BufferedReader br = new BufferedReader (new FileReader("i.txt"));
         
        for (int I = 0; I < m; I++) {
             
            String[] input = br.readLine().split(" ");
            
             //System.out.println(input[0]);
             //System.out.println(input[1]);
        int v=  Integer.parseInt(  input[0]);
        int k=  Integer.parseInt(  input[1]);
                graph[v][k] = 1;
                graph [k][v]=1;
            }
        
         
        Arrays.fill(color, false);      // initially all are unvisited
  
        int src = Integer.parseInt(br.readLine());      //Source node
        int dst = Integer.parseInt(br.readLine());      //Destination node
  
        dfs(src, dst);  // backtracking
    }
     static void dfs(int src, int dst) {
       
        list.add(src);
        size++;
          
        
        color[src] = true;
        int i=0;
        
        if (src == dst) {
             
            
            for ( Object node:list) {
                
                if(node.equals(1)){
                    
                System.out.print("arad" + "  ");
                a[i]="arad";
                i++;
                }
                else if(node.equals(2)){
                     
                    System.out.print("zenind" + "  ");
                    a[i]="zenind";
                    i++;
                }
                else if(node.equals(3)){
                System.out.print("timisoara" + "  ");
                a[i]="timisoara";i++;
                }
                else if(node.equals(4)){
                   
                System.out.print("sibiu" + "  ");
                a[i]="sibiu";i++;
                }
                else if(node.equals(5)){
                   
                System.out.print("odarea" + "  ");
                a[i]="odarea";i++;
                }
                else if(node.equals(6)){
                   
                System.out.print("lugoj" + "  ");
                a[i]="lugoj";i++;
                }
                else if(node.equals(7)){
                   
                System.out.print("mehadia" + "  ");
                a[i]="mehadia";i++;
                }
                else if(node.equals(8)){
                   
                System.out.print("dobreta" + "  ");
                a[i]="dobreta";i++;
                }
                else if(node.equals(9)){
                   
                System.out.print("rimmicu vilcea" + "  ");
                a[i]="rimmicu vilcea";i++;
                }
                else if(node.equals(10)){
                   
                System.out.print("craiova" + "  ");
                a[i]="craiova";i++;
                }
                else if(node.equals(11)){
                   
                System.out.print("pitesti" + "  ");
                a[i]="pitesti";i++;
                }
                else if(node.equals(12)){
                   
                System.out.print("farara" + "  ");
                a[i]="farara";i++;
                }
                else if(node.equals(13)){
                   
                System.out.print("bucharest" + "  ");
                a[i]="bucharest";i++;
                }
                else if(node.equals(14)){
                   
                System.out.print("giurgui" + "  ");
                a[i]="giurgui";i++;
                }
                else if(node.equals(15)){
                   
                System.out.print("urziceni" + "  ");
                a[i]="urziceni";i++;
                }
                else if(node.equals(16)){
                   
                System.out.print("neamt" + "  ");
                a[i]="neamt";i++;
                }
                else if(node.equals(17)){
                   
                System.out.print("iasi" + "  ");
                a[i]="iasi";i++;
                }
                else if(node.equals(18)){
                   
                System.out.print("vaslui" + "  ");
                a[i]="vaslui";i++;
                }
                else if(node.equals(19)){
                   
                System.out.print("hirsova" + "  ");
                a[i]="hirsova";i++;
                }
                else {
                     
                System.out.print("eforie" + "  ");
                a[i]="eforie";i++;
                }
            }
            
          for(int j=0;j<a.length;j++){
              if((a[j]=="rimmicu vilcea"&&a[j+1]=="pitesti")||(a[j]=="farara"&&a[j+1]=="urziceni")){
                   System.out.print("---> "+"it is unsafe path");}
              
                a[j]=null;
            
            }
           System.out.println();
           
            return;
           
            
        }
         
         
        for (int I = 1; I <= dim; I++) {
            
            if (graph[src][I] == 1) {
                 
                
                if (color[I] == false) {
                     
                    
                    dfs(I, dst);
                     
                    
                    color[I] = false;
                     
                    
                    size--;
                     
                    list.remove(size);
                    
                }
            }
        }
    }
}