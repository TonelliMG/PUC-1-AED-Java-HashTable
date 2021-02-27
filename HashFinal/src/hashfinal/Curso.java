package hashfinal;

import java.util.*;

public class Curso {
public String CódCurso;
public String NomeCurso;
public Curso(){
UUID MeuUUID=UUID.randomUUID();
this.CódCurso=MeuUUID.toString().toUpperCase().substring(15,18);
}
public void LêCurso(){
Scanner S=new Scanner(System.in);
System.out.printf("Código do Curso: %1$s\n",this.CódCurso);
System.out.print("Nome do Curso..:");
this.NomeCurso=S.nextLine();
}
}