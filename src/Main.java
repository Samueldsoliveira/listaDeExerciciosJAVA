import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //1. Faça um programa que leia um numero inteiro e o imprima.
//
//			int inteiro;
//
//			System.out.println("Informe um número inteiro: ");
//			inteiro = input.nextInt();
//
//			System.out.println("Número inteiro digitado foi: " + inteiro);



        //2. Faça um programa que leia um numero real e o imprima
//				Scanner input = new Scanner(System.in);
//				double real;
//
//				System.out.println("Digite um número real:");
//				real = input.nextDouble();
//
//				System.out.println("O número real digitado foi: " + real);



        //3. Peça ao usuario para digitar três valores inteiros e imprima a soma deles.
//				Scanner input = new Scanner(System.in);
//				int soma1, soma2, soma3, somaFinal;
//
//				System.out.println("Digite o primeiro número:");
//				soma1 = input.nextInt();
//
//				System.out.println("Digite o segundo número:");
//				soma2 = input.nextInt();
//
//				System.out.println("Digite o terceiro número:");
//				soma3 = input.nextInt();
//
//				somaFinal = soma1 + soma2 + soma3;
//				System.out.println("O Resultado da soma é: " + somaFinal);




        //4. Leia um numero real e imprima o resultado do quadrado desse numero.
//				Scanner input = new Scanner(System.in);
//				double real, resultado;
//
//				System.out.println("Digite o número para conversão:");
//				real = input.nextDouble();
//
//				resultado = real * real;
//				System.out.println("O Resultado do quadrado de " + real + " é: " + resultado);



        //5. Leia um numero real e imprima a quinta parte deste numero.
//				Scanner input = new Scanner(System.in);
//				double real, resultado;
//
//				System.out.println("Digite um número:");
//				real = input.nextDouble();
//
//				resultado = real / 5;
//				System.out.println("A quinta parte de " + real + " é: " + resultado);



        //6. Leia uma temperatura em graus Celsius e apresente-a convertida em graus Fahrenheit.
//		A formula de conversao é:F = C∗(9.0/5.0)+32.0, sendo F a temperatura em Fahrenheit
//		e C a temperatura em Celsius.
//		        Scanner input = new Scanner(System.in);
//		        double F, C;
//
//		        System.out.println("Informe a temperatura em Celsius:");
//		        C = input.nextDouble();
//		        F = C*(9.0/5.0)+32.0;
//
//		        System.out.println("A temperatura " + C + " em Fahrenheit é: " + F);



        //7. Leia uma temperatura em graus Fahrenheit e apresente-a convertida em graus Celsius.
//		A formula de conversao e: C = 5.0 ∗ (F − 32.0)/9.0, sendo C a temperatura em Celsius
//		e F a temperatura em Fahrenheit.
//		  Scanner input = new Scanner(System.in);
//        float F, C;
//
//		  System.out.println("Informe a temperatura em Fahrenheit:");
//		  F = input.nextFloat();
//		  C = (float) (5.0 * (F-32.0)/9.0);
//
//		  System.out.printf("A temperatura " + F + " em Celsius é: " + C);



//		8. Leia uma temperatura em graus Kelvin e apresente-a convertida em graus Celsius. A
////	formula de conversao˜ e:C = K − 273.15, sendo C a temperatura em Celsius e K a
////	temperatura em Kelvin.
//		    Scanner input = new Scanner(System.in);
//		    float K, C;
//
//		    System.out.println("Informe a temperatura em Kelvin:");
//		    K = input.nextFloat();
//
//		    C = (float) (K - 273.15);
//		    System.out.println("A temperatura de " + K + " em Celsius é: " + C);



//		9. Leia uma temperatura em graus Celsius e apresente-a convertida em graus Kelvin. A
////	formula de conversao˜ e: K = C + 273.15, sendo C a temperatura em Celsius e K a
////	temperatura em Kelvin.
//
//		    Scanner input = new Scanner(System.in);
//		    float C, K;
//
//		    System.out.println("Digite uma temperatura em Celsius:");
//		    C = input.nextFloat();
//		    K = (float) (C + 273.15);
//
//		    System.out.println("A temperatura de " + C + " em Kelvin é: " + K);



//		10. Leia uma velocidade em km/h (quilometros por hora) e apresente-a convertida em m/s ˆ
////	(metros por segundo). A formula de convers ´ ao˜ e: ´ M = K/3.6, sendo K a velocidade em
////	km/h e M em m/s.
//
//		    Scanner input = new Scanner(System.in);
//		    double Km, Ms;
//
//		    System.out.println("Digite a velocidade em KM/s:");
//		    Km = input.nextDouble();
//		    Ms = Km/3.6;
//
//		    System.out.println("A velocidade de " + Km + " em Metros por Segundo é:" + Ms);



//		11. Leia uma velocidade em m/s (metros por segundo) e apresente-a convertida em km/h
////	(quilometros por hora). A formula de conversao˜ e:K = M ∗ 3.6, sendo K a velocidade
////	em km/h e M em m/s.
//
//		    Scanner input = new Scanner(System.in);
//		    double Ms, Km;
//
//		    System.out.println("Digite a velocidade em Metros por segundo:");
//		    Ms = input.nextDouble();
//		    Km = Ms * 3.6;
//
//		    System.out.println("O resultado da velocidade " + Ms + " metros por segundo em Km/h é: " + Km);



//		12. Leia uma distancia em milhas e apresente-a convertida em quilometros. A formula de
////	conversao e:K = 1, 61 ∗ M, sendo K a distancia em quilometros e M em milhas.
//
//		    Scanner input = new Scanner(System.in);
//		    float M, K;
//
//		    System.out.println("Digite a distância em Milhas:");
//		    M = input.nextFloat();
//		    K = (float) (0.621371 * M);
//
//		    System.out.println("A distancia " + M + " covertida em Quilômetros é: " + K);




//		13. Leia uma distancia em quilometros e apresente-a convertida em milhas. A formula de
////	conversao e: M = K 1,61 , sendo K a distancia em quilometros e M em milhas.
//
//		    Scanner input = new Scanner(System.in);
//		    double K, M;
//
//		    System.out.println("Digite a distância em Quilômetros:");
//		    K = input.nextDouble();
//		    M = K /0.621371;
//
//		    System.out.println("A distância " + K + " de Quilometros para Milhas é: " + M);



//		14. Leia um angulo em graus e apresente-o convertido em radianos. A formula de conversao
////	e: R = G ∗ π/180, sendo G o angulo em graus e ˆ R em radianos e π = 3.14
//
//		    Scanner input = new Scanner (System.in);
//		    double g, r;
//
//		    System.out.println("Escreva um ângulo em graus:");
//		    g = input.nextInt();
//
//		    r = g * 3.14/180;
//		    System.out.println("O angulo dado em graus convertido em Radiano será: " + r);



//		//15.Leia um angulo em radianos e apresente-o convertido em graus. A formula de conversao
//		//e: G = R ∗ 180/π, sendo G o angulo em graus e R em radianos e π = 3.14.
//
//			input = new Scanner (System.in);
//			int r, g;
//
//			System.out.println("Escreva um número em Radiano:");
//			r = input.nextInt();
//
//			g = (int) (r * 180/3.14);
//			System.out.println("O número radiano convertido para em graus será: " + g);




//		16. Leia um valor de comprimento em polegadas e apresente-o convertido em centımetros.
//		A formula de conversao e:C = P ∗ 2, 54, sendo C o comprimento em centımetros e P o
//		comprimento em polegadas.
//
//		    input = new Scanner (System.in);
//		    int c, p;
//
//		    System.out.println("Escrava um valor em polegadas:");
//		    p = input.nextInt();
//
//		    c = (int) (p * 2.54);
//		    System.out.println("O numéro em polegadas convertido para centimetros será: " + c);



//		17. Leia um valor de comprimento em centımetros e apresente-o convertido em polegadas.
//		A formula de conversao e: P = C 2,54 , sendo C o comprimento em centımetros e P o comprimento em polegadas.
//
//		    input = new Scanner (System.in);
//		    int c, p;
//
//		    System.out.println("Escreva um número em centimetros:");
//		    c = input.nextInt();
//
//		    p = (int) (c/2.54);
//		    System.out.println("O número escrito em centimetros, convertido em polegadas será: " + p);



//		18. Leia um valor de volume em metros cubicos m3 e apresente-o convertido em litros. A
//		formula de conversao e: L = 1000 ∗ M, sendo L o volume em litros e M o volume em
//		metros cubicos.
//
//		    input = new Scanner(System.in);
//		    int m, l;
//
//		    System.out.println("Escreva um numero em Metros Cubicos:");
//		    m = input.nextInt();
//
//		    l = 1000 * m;
//		    System.out.println("O número em metros convertido em litros será: " + l);



//		19. Leia um valor de volume em litros e apresente-o convertido em metros cubicos m3
//		. A formula de conversao e: M = L 1000 , sendo L o volume em litros e M o volume em metros cubicos.
//
//		    input = new Scanner (System.in);
//		    int l, m;
//
//		    System.out.println("Escreva um valor em Litros");
//		    l = input.nextInt();
//
//		    m = l/1000;
//		    System.out.println("O resultado de " + l + " litros para metros será: " + m);



//		20. Leia um valor de massa em quilogramas e apresente-o convertido em libras. A formula
//		de conversao e: L = K 0,45 , sendo K a massa em quilogramas e L a massa em libras.
//
//		    input = new Scanner(System.in);
//		    double k, l;
//
//		    System.out.println("Digite um valor de Quilogramas:");
//		    k = input.nextDouble();
//
//		    l = k/0.45;
//		    System.out.println("O resultado de " + k + " convertido em Libras será: " + l);



//		21. Leia um valor de massa em libras e apresente-o convertido em quilogramas. A formula
//		de conversao e: K = L∗ 0, 45, sendo K a massa em quilogramas e L a massa em libras.
//
//		    input = new Scanner(System.in);
//		    double l, k;
//
//		    System.out.println("Digite um número de massa em Libras:");
//		    l = input.nextDouble();
//
//		    k = l * 0.45;
//		    System.out.println("O resultado de " + l + " libras em Quilogramas será: " + k);




//		22. Leia um valor de comprimento em jardas e apresente-o convertido em metros. A formula
//		de conversao e: M = 0, 91 ∗ J, sendo J o comprimento em jardas e M o comprimento
//		em metros.
//
//		    input = new Scanner(System.in);
//		    double j, m;
//
//		    System.out.println("Digite um número em Jardas:");
//		    j = input.nextDouble();
//
//		    m = 0.91 * j;
//		    System.out.println("O resultado de " + j + " Jardas em Metros será: " + m);



//		23. Leia um valor de comprimento em metros e apresente-o convertido em jardas. A formula
//		de conversao e: J = M/0,91 , sendo J o comprimento em jardas e M o comprimento em metros.
//
//		    input = new Scanner(System.in);
//		    double m, j;
//
//		    System.out.println("Digite um valor em Metros:");
//		    m = input.nextDouble();
//
//		    j = m/0.91;
//		    System.out.println("O valor de " + m + " Metros convertidos para Jardas, será: " + j);



//		24. Leia um valor de area em metros quadrados m2 e apresente-o convertido em acres. A
//		formula de conversao˜ e: A = M ∗ 0, 000247, sendo M a area em metros quadrados e A
//		a area em acres.
//
//		    input = new Scanner(System.in);
//		    double m, a;
//
//		    System.out.println("Digite um número em Metros Quadrados:");
//		    m = input.nextDouble();
//
//		    a = m * 0.000247;
//		    System.out.println("O valor de " + m + " Metros convertido para Acres será: " + a);





        //		24. Leia um valor de area em metros quadrados m2 e apresente-o convertido em acres. A
//		formula de conversao e: A = M ∗ 0, 000247, sendo M a area em metros quadrados e A
//		a area em acres.

//		    double m, a;
//
//		    System.out.println("Digite um valor em Metros Quadrados:");
//		    m = input.nextDouble();
//
//		    a = m * 0.000247;
//		    System.out.println("O valor de "+m+" Metros Quadrados em Acres será: "+a);




//		25. Leia um valor de area em acres e apresente-o convertido em metros quadrados m2
//		.A formula de conversao e: M = A ∗ 4048, 58, sendo M a area em metros quadrados e A a
//		area em acres.
//
//		    double m, a;
//
//		    System.out.println("Digite um valor em Acres:");
//		    a = input.nextDouble();
//
//		    m = a * 4048.58;
//		    System.out.println("O valor de " + a + (" Acres em Metros Quadrados será: " + m));




//		 26. Leia um valor de area em metros quadrados m2 e apresente-o convertido em hectares.
//		 A formula de conversao e:H = M ∗ 0, 0001, sendo M a area em metros quadrados e H
//		 a area em hectares.
//
//		     double m, h;
//
//		     System.out.println("Digite um valor em Metros Quadrados:");
//		     m = input.nextDouble();
//
//		     h = m * 0.0001;
//		     System.out.println("O valor de " + m + " Metros Quadrados em Hectares será: " + h);




//		 27. Leia um valor de area em hectares e apresente-o convertido em metros quadrados m2
//		 A formula de conversao e:M = H ∗ 10000, sendo M a area em metros quadrados e H
//		 a area em hectares.
//
//		     int m, h;
//
//		     System.out.println("Digite um valor em Hectares:");
//		     h = input.nextInt();
//
//		     m = h * 10000;
//		     System.out.println("O valor de " + h + " Hectares para Metros Quadrados será: " + m);




//		 28. Faca a leitura de tres valores e apresente como resultado a soma dos quadrados dos
//		 tres valores lidos.
//
//		    int n1, n2, n3, resultado;
//
//		    System.out.println("Digite o Primeiro Valor:");
//		    n1 = input.nextInt();
//		    System.out.println("Digite o Segundo Valor:");
//		    n2 = input.nextInt();
//		    System.out.println("Digite o Terceiro Valor:");
//		    n3 = input.nextInt();
//
//		    resultado =  n1 * 2 + n2 * 2 + n3 * 2;
//		    System.out.println("Somas dos Quadrados vai ser: " + resultado);




//		 29. Leia quatro notas, calcule a media aritmetica e imprima o resultado.
//
//		    int n1, n2, n3, n4, resultado;
//
//		    System.out.println("Digite o Primeiro Valor:");
//		    n1 = input.nextInt();
//		    System.out.println("Digite o Segundo Valor:");
//		    n2 = input.nextInt();
//		    System.out.println("Digite o Terceiro Valor:");
//		    n3 = input.nextInt();
//		    System.out.println("Digite o Quarto Valor:");
//		    n4 = input.nextInt();
//
//		    resultado = (n1 + n2 + n3 + n4) /4;
//		    System.out.println("O Resultado da Média Aritmética será: " + resultado);




//		 30. Leia um valor em real e a cotacao do dolar. Em seguida, imprima o valor correspondente
//		 em dolares.

//          double real, dolar, resultado;
//
//		    System.out.println("Digite um valor em Reais:");
//		    real = input.nextDouble();
//
//		    resultado = real / 5.15;
//		    System.out.println("O valor de " + real + " Reais em Dolar será: " + resultado);




//       31. Leia um numero inteiro e imprima o seu antecessor e o seu sucessor.

//            int antecessesor, sucessor, n1;
//
//            System.out.println("Digite um número inteiro: ");
//                    n1 = input.nextInt();
//            sucessor = n1 + 1;
//            antecessesor = n1 - 1;
//
//            System.out.println("O sucessor de " + n1 + " será: " + sucessor);
//            System.out.println("O antecessor de " + n1 + " será: " + antecessesor);




//        32. Leia um numero inteiro e imprima a soma do sucessor de seu triplo com o antecessor de
//        seu dobro

//              int n1, sucessorTriplo, antecessorDobro, resultado;
//
//              System.out.println("Escreva um numero inteiro: ");
//              n1 = input.nextInt();
//
//              sucessorTriplo = 3 * n1 + 1;
//              antecessorDobro = 2 * n1 -1;
//              resultado =  sucessorTriplo + antecessorDobro;
//              System.out.println("O resultado da conta será: " + resultado);




//        33. Leia o tamanho do lado de um quadrado e imprima como resultado a sua area

//                int base, altura, resultado;
//
//
//                System.out.println("Digite o tamanho da Base: ");
//                base = input.nextInt();
//                System.out.println("Digite o tamanho da Altura: ");
//                altura = input.nextInt();
//
//                resultado = base * altura;
//                System.out.println("A area do quadrado sera: " + resultado);




//         34. Leia o valor do raio de um cırculo e calcule e imprima a area do cırculo correspondente.
//         A area do cırculo e π ∗ raio2, considere π = 3.141592.

//                  int area;
//                  double resultado;
//
//                  System.out.println("Digite o raio de um circulo: ");
//                  area = input.nextInt();
//
//                  resultado = 3.141592 * (area * area);
//                  System.out.println("A area do circulo sera: " + resultado);




//        35. Sejam a e b os catetos de um triangulo, onde a hipotenusa e obtida pela equacao:
//        hipotenusa = √a2 + b2. Faca um programa que receba os valores de a e b e calcule o valor
//        da hipotenusa atraves da equacao. Imprima o resultado dessa operacao.

//                    int catA, catB;
//                    double hipotenusa, resultado;
//
//                    System.out.println("Digite o cateto A: ");
//                    catA = input.nextInt();
//                    System.out.println("Digite o cateto B: ");
//                    catB = input.nextInt();
//
//                    hipotenusa = (catA * catA) + (catB * catB);
//                    resultado = Math.sqrt(hipotenusa);
//
//                    System.out.println("O valor da hipotenusa sera: " + resultado);




//        36. Leia a altura e o raio de um cilindro circular e imprima o volume do cilindro. O volume
//        de um cilindro circular e calculado por meio da seguinte formula:
//        V = π ∗ raio2 ∗ altura, onde π = 3.141592.

//                      int raio, altura;
//                      double resultado;
//
//                      System.out.println("Digite o tamanho da altura: ");
//                      altura = input.nextInt();
//                      System.out.println("Digite o tamanho do raio: ");
//                      raio = input.nextInt();
//
//                      resultado = 3.141592 * (raio * raio) * altura;
//                      System.out.println("O volume do cilindro será: " + resultado);




//        37. Faça um programa que leia o valor de um produto e imprima o valor com desconto, tendo
//        em vista que o desconto foi de 12%

//                      int produto;
//                      double resultado, desconto;
//
//                      System.out.println("Digite o valor do produto: ");
//                      produto = input.nextInt();
//
//                      desconto = produto * 10/100;
//                      resultado = produto - desconto;
//                      System.out.println("O valor com desconto será: " + resultado);




//        38. Leia o salario de um funcionario. Calcule e imprima o valor do novo salario, sabendo que
//        ele recebeu um aumento de 25%.

//                    double salario, aumento;
//
//                    System.out.println("Digite o valor do salario: ");
//                    salario = input.nextDouble();
//
//                    aumento = ((100 + 25.0) / 100.0) * salario;
//                    System.out.println("O valor do salario com aumento sera: " + aumento);




//        39. A importancia de R$ 780.000,00 ser a dividida entre tres ganhadores de um concurso.
//        Sendo que da quantia total:
//                  • O primeiro ganhador recebera 46%;
//                  • O segundo recebera 32%;
//                  • O terceiro recebera o restante;
//        Calcule e imprima a quantia ganha por cada um dos ganhadores.














    }
}








