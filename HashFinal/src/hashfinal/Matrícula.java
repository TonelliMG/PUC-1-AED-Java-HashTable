package hashfinal;

import java.util.*;

public class Matrícula {
public String NumMatrícula;
public String CódAluno;
public String CódCurso;
public String DataMatrícula;


public Matrícula(){
UUID MeuUUID=UUID.randomUUID();
this.NumMatrícula=MeuUUID.toString().toUpperCase().substring(15,18);
}


public void LêMatrícula(){
    
Scanner S=new Scanner(System.in);
System.out.printf("Número da Matrícula: %1$s\n",this.NumMatrícula);
System.out.print("Código do Aluno....: ");
this.CódAluno=S.nextLine();
System.out.print("Código do Curso....: ");
this.CódCurso=S.nextLine();
System.out.print("Data da Matrícula..: ");
this.DataMatrícula=S.nextLine();

}
}