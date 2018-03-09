package com.xq.lite.tree;

import java.util.ArrayList;
import java.util.List;

public class List2Tree {
  private int id;

  private String name;

  private int parentId;

  private List<List2Tree> childrens;

  public List2Tree(int id,String name,int parentId){
    this.id = id;
    this.name = name;
    this.parentId = parentId;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getParentId() {
    return parentId;
  }

  public void setParentId(int parentId) {
    this.parentId = parentId;
  }

  public List<List2Tree> getChildrens() {
    return childrens;
  }

  public void setChildrens(List<List2Tree> childrens) {
    this.childrens = childrens;
  }



  @Override
  public String toString() {
    return "Tree [id=" + id + ", name=" + name + ", parentId=" + parentId
        + ", childrens=" + childrens + "]";
  }

  public static void main(String[] args) {
    List2Tree tree1 = new List2Tree(1, "顶层节点1", 0);
    List2Tree tree2 = new List2Tree(2, "顶层节点2", 0);
    List2Tree tree3 = new List2Tree(3, "顶层节点3", 0);

    List2Tree tree4 = new List2Tree(4, "二级节点4", 1);
    List2Tree tree5 = new List2Tree(5, "二级节点5", 2);
    List2Tree tree6 = new List2Tree(6, "二级节点6", 3);

    List2Tree tree7 = new List2Tree(7, "三级节点7", 4);
    List2Tree tree8 = new List2Tree(8, "三级节点8", 4);
    List2Tree tree9 = new List2Tree(9, "三级节点9", 5);

    List<List2Tree> trees = new ArrayList<List2Tree>();
    trees.add(tree9);
    trees.add(tree8);
    trees.add(tree7);
    trees.add(tree6);
    trees.add(tree5);
    trees.add(tree4);
    trees.add(tree3);
    trees.add(tree2);
    trees.add(tree1);

    List<List2Tree> rootTrees = new ArrayList<List2Tree>();
    for (List2Tree tree : trees) {
      if(tree.getParentId() == 0){
        rootTrees.add(tree);
      }
      for (List2Tree t : trees) {
        if(t.getParentId() == tree.getId()){
          if(tree.getChildrens() == null){
            List<List2Tree> myChildrens = new ArrayList<List2Tree>();
            myChildrens.add(t);
            tree.setChildrens(myChildrens);
          }else{
            tree.getChildrens().add(t);
          }
        }
      }
    }

    for (List2Tree tree : rootTrees) {
      System.out.println(tree.toString());
    }

  }


}
