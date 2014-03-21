package com.neeraj2608.rpalinterpreter;

import java.io.IOException;

public class Controller{

  public static void main(String[] args){
    String fileName = "test-input/test.txt";
    printListing(fileName);
    AST ast = buildAST(fileName, true);
  }

  private static void printListing(String fileName){
    // TODO Auto-generated method stub
  }

  private static AST buildAST(String fileName, boolean printOutput){
    AST ast = null;
    try{
      Scanner scanner = new Scanner(fileName);
      Parser parser = new Parser(scanner);
      ast = parser.buildAST();
      //ast.print();
    }catch(IOException e){
      System.out.println("ERROR: Could not read from file: " + fileName);
    }
    return ast;
  }

}