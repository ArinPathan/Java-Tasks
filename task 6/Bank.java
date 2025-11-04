import java.lang.*;
public abstract class Bank{
private String name;
private String type;
private int branchNo;

public Bank(){};
public Bank(String name, String type, int branchNo){
	this.name=name;
	this.type=type;
	this.branchNo=branchNo;
}

public abstract void info();

}