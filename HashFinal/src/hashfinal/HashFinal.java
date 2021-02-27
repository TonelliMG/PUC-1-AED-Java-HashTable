package hashfinal;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import java.util.*;

public class HashFinal {

 public static void main(String[] args) {
Scanner S = new Scanner(System.in);

Dados Cadastro = new Dados();

Aluno MeuAluno;
Curso MeuCurso;
Matrícula MinhaMatrícula;

 do {
ConsoleClear();

 MeuAluno = new Aluno();

 MeuAluno.LêAluno();

 Cadastro.GravaDados(MeuAluno);

 System.out.print("\nDeseja cadastrar outro Aluno? (S/N)");

 } while (S.nextLine().toUpperCase().charAt(0) != 'N');
do {
ConsoleClear();

 MeuCurso = new Curso();

 MeuCurso.LêCurso();

 Cadastro.GravaDados(MeuCurso);

 System.out.print("\nDeseja cadastrar outro Curso? (S/N)");

 } while (S.nextLine().toUpperCase().charAt(0) != 'N');
do {
ConsoleClear();

 MinhaMatrícula = new Matrícula();

 MinhaMatrícula.LêMatrícula();

 Cadastro.GravaDados(MinhaMatrícula);

 System.out.print("\nDeseja cadastrar outra Matrícula? (S/N)");

 } while (S.nextLine().toUpperCase().charAt(0) != 'N');
ConsoleClear();
Cadastro.ListaMatrículas();
}

 static void ConsoleClear() {
try {
Robot robot = new Robot();

 robot.setAutoDelay(5);
robot.keyPress(KeyEvent.VK_CONTROL);
robot.keyPress(KeyEvent.VK_L);

 robot.keyRelease(KeyEvent.VK_CONTROL);
robot.keyRelease(KeyEvent.VK_L);

 } catch (AWTException ex) {
System.out.println(ex.getMessage());
}
}
}