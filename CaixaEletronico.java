/*********************************************************************/
/** ACH2001 - Introdução à Ciência da Computação I                  **/
/** EACH-USP - Primeiro Semestre de 2011                            **/
/** Turma 84 - Norton Trevisan Roman                                **/
/**                                                                 **/
/** Primeiro Exercício-Programa                                     **/
/** Arquivo: CaixaEletrônico.java                                   **/
/**                                                                 **/
/** Virgílio Aparecido Fernandes Júnior                             **/
/**                                                                 **/
/** Data de Entrega: 15/04/2011                                     **/
/*********************************************************************/

class CaixaEletronico {
    static int I, K, L, M;

/*  O método verifica quantas vezes o valor mais alto disponível cabe 
    dentro do valor passado como parâmetro, depois subtrai quantas vezes o valor
    da nota coube no parâmetro, verificando em seguida a próxima nota de maior valor. */
    static void fazRetirada(int valor) {
        final int CINQUENTA = 50, DEZ = 10, CINCO = 5, UM = 1;      
/*      Verifica se o valor é negativo pra fazer o cálculo ou atribuir
        -1 às variáveis */
        if (valor > 0) {
        
            I = K = L = M = 0;

            if (valor >= CINQUENTA) {
                I = valor / CINQUENTA;
                valor = valor - (CINQUENTA * I);
            }
            
            if (valor >= DEZ) {
                K = valor / DEZ;
                valor = valor - (DEZ * K);
            }
            
            if (valor >= CINCO) {
                L = valor / CINCO;
                valor = valor - (CINCO * L);
            }
            
            if (valor >= UM) {
                M = valor / UM;
                valor = valor - (UM * M);
            }
        } else
            I = K = L = M = -1;     
    }
    
    public static void main(String args[]) {        
        fazRetirada(25);        
    }
}