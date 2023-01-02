public class Operadores {
    
    public static void main(String[] args) {
        
       // int numero = 5;

        //numero = - numero;
       // System.out.println( numero);

        //numero =  numero * -1;
       // System.out.println( numero);
/////////////////////////////////////////////////////////////
     
int a, b;

a = 5;
b = 6;
String resultado = "";
// EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
/*if(a==b)
   resultado = "verdadeiro";
else
   resultado = "falso";
*/

//MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
resultado = (a==b) ? "verdadeiro" : "false";
int resultad = a==b ? 1 : 0;

//System.out.println(resultado);

/////////////////////////////////////////////////////////////////////

int numero1 = 1;
int numero2 = 2;

boolean simNao = numero1 == numero2;

System.out.println( simNao);

}

}
