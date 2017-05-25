/*********************************************************************/
/** ACH2001 - Introdução à Ciência da Computação I                  **/
/** EACH-USP - Primeiro Semestre de 2011                            **/
/** Turma 84 - Norton Trevisan Roman                                **/
/**                                                                 **/
/** Primeiro Exercício-Programa                                     **/
/** Arquivo: Raiz.java                                              **/
/**                                                                 **/
/** Virgílio Aparecido Fernandes Júnior                             **/
/**                                                                 **/
/** Data de Entrega: 15/04/2011                                     **/
/*********************************************************************/

class Raiz {
/* Este programa calcula a raiz quadrada de um elemento utilizando as 
   o método de Newton */
    static double raizQuadrada(double a, double epsilon) {
/* Verifica-se os dados iniciais do enunciado (a < 0) ou 0 < e < 1 */       
        if ((a < 0) || ((epsilon <= 0) || (epsilon >= 1)))
            return -1;
        
        double xn, xnp1, abs;
        
        //Fórmula para o x0
        xn = a / 2;
        
        //Lógica para execução da fórmula do xn+1
        do {        
            xnp1 = (xn / 2) + ((a / xn) / 2);
            // Cálculo do valor absoluto entre xn+1 - xn
            abs = xnp1 - xn >= 0 ? xnp1 - xn : -(xnp1 - xn);
            xn = xnp1;
        } while (abs >= epsilon);
            
        return xnp1;
    }
    
    public static void main(String args[]) {
        raizQuadrada(63, 0.001);
    }
}