class Tree{
  //declare variables treeName, treeType, leavesFall, leafColor
  String treeName;
  String treeType;
  boolean leavesFall;
  String leafColor;

  //two constructors
  Tree() {
		treeName = "";
		treeType = "";
		leavesFall = false;
    leafColor = "";
	}

  Tree(String aTreeName, String aTreeType, boolean aLeavesFall, String aLeafColor) {
		treeName = aTreeName;
		treeType = aTreeType;
		leavesFall = aLeavesFall;
    leafColor = aLeafColor;
	}

  //accessor and mutator methods
  void setTreeName(String aTreeName){
    treeName = aTreeName;
  }

  public String getTreeName(){
    return treeName;
  }

  void setTreeType(String aTreeType){
    treeType = aTreeType;
  }

  public String getTreeType(){
    return treeType;
  }

  void setLeavesFall(boolean aLeavesFall){
    leavesFall = aLeavesFall;
  }

  public String getLeavesFall(){
    if(leavesFall == false){
      return "does not";
    }else{
      return "does";
    }
  }

  //print method
  void print(){
    System.out.println("This is a " + treeName + " tree. It is a " + treeType + " and its leaves are currently " + leafColor + ". It " + getLeavesFall() + " lose its leaves for the winter");
  }
}