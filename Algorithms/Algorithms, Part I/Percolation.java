//https://coursera.cs.princeton.edu/algs4/assignments/percolation/specification.php

import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {   
   // creates a n-by-n grid with all site initially blocked
   public Percolation(int n) {
   
   }
   
   // opens the site (row, col) if it is not open already
   public void open(int row, int col) {
      if(row > 1 || col > 1 || row <= n || col <= n) {
         throw IllegalArgumentException();
      }
   }
   
   // is the site at (row, col) open?
   public boolean isOpen(int row, int col) {
      if(row > 1 || col > 1 || row <= n || col <= n) {
         throw IllegalArgumentException();
      }
      return;
   }
   
   // is the site at (row, col) full?
   public boolean isFull(int row, int col) {
      if(row > 1 || col > 1 || row <= n || col <= n) {
         throw IllegalArgumentException();
      }
      return;
   }
   
   // returns the number of open sites
   public int numberOfOpenSites() {
      return;
   }
   
   // does the system percolate?
   public boolean percolates() {
   
   }
   
   // optional test client 
   // public static void main(String[] args) {} 
}