package com.neeraj2608.rpalinterpreter.csem;

import java.util.Stack;

import com.neeraj2608.rpalinterpreter.ast.AST;
import com.neeraj2608.rpalinterpreter.ast.ASTNode;

public class CSEMachine{
  
  private Stack<ASTNode> controlStack;
  private Environment currentEnv;
  
  public CSEMachine(AST ast){
    if(!ast.isStandardized())
      throw new EvaluationException("AST is NOT standardized!");
    Delta d = ast.createDelta();
  }

  public String run(){
    return null;
  }

}
