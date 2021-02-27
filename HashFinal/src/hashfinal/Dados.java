package hashfinal;

import java.util.*;

public class Dados {
public Hashtable CadAluno;
public Hashtable CadCurso;
public Hashtable CadMatrícula;
public Dados(){
CadAluno=new Hashtable();
CadCurso=new Hashtable();
CadMatrícula=new Hashtable();
}

public void GravaDados(Aluno x){
CadAluno.put(x.CódAluno, x);
}

public void GravaDados(Curso x){
CadCurso.put(x.CódCurso, x);
}

public void GravaDados(Matrícula x){
CadMatrícula.put(x.NumMatrícula, x);
}

public void ListaMatrículas(){
Set<String> SetOfMatrículas=CadMatrícula.keySet();

for(String ChaveMatrícula:SetOfMatrículas){
Matrícula xMat=(Matrícula)CadMatrícula.get(ChaveMatrícula);
System.out.printf("Matrícula: %1$s\n", xMat.NumMatrícula);
Aluno xAlu=(Aluno)CadAluno.get(xMat.CódAluno);
System.out.printf("Aluno: %1$s\n", xAlu.NomeAluno);
Curso xCur=(Curso)CadCurso.get(xMat.CódCurso);
System.out.printf("Curso: %1$s\n\n",xCur.NomeCurso);
}

}

}