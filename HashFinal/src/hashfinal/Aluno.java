
package hashfinal;

import java.util.*;

public class Aluno {
public String CódAluno;
public String NomeAluno;
public Aluno(){
UUID MeuUUID=UUID.randomUUID();
this.CódAluno=MeuUUID.toString().toUpperCase().substring(15,18);
}

public void LêAluno(){
Scanner S=new Scanner(System.in);
System.out.printf("Código do Aluno: %1$s\n",this.CódAluno);
System.out.print( "Nome...........: ");
this.NomeAluno=S.nextLine();
}

}