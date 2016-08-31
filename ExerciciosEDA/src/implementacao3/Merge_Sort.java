package implementacao3;



class MergeSort  {
	
	public static void ordena1(int[] vetor, int esquerda, int meio, int direita){
		int[] A;
		A = new int[meio-esquerda+2];

		int[] B;
		B = new int[direita-meio+1];

		int i;

		// Copia a primeira parte pra A
		for(i = esquerda; i <= meio; i++)
			A[i-esquerda] = vetor[i];

		// Coloque o maior valor na ultima posição de A
		A[A.length-1] = Integer.MAX_VALUE;

		// Copia a segunda parte em B
		for(i = meio+1; i <= direita; i++)
			B[i-(meio+1)] = vetor[i];

		// Coloque o maior valor na ultima posição de B
		B[B.length-1] = Integer.MAX_VALUE;
		
		i = 0;		// A
		int j = 0;	// B
		int l;

		// Juntando A e B no vetor
		for(l = esquerda; l <= direita; l++){
			if(A[i] <= B[j]){
				vetor[l] = A[i];
				i++;
			}
			else{
				vetor[l] = B[j];
				j++;
			}
		}		


	}
	public static void recursivoMergeSort(int[] vetor, int esquerda, int direita){
		if (esquerda < direita)
		{
			int meio = (esquerda + direita)/2;
			recursivoMergeSort(vetor, esquerda, meio);
			recursivoMergeSort(vetor, meio+1, direita);
			ordena1(vetor, esquerda, meio, direita);
		}
	}

	public static void ordena(int[] vetor, int n){
		recursivoMergeSort(vetor, 0, n-1);
	}
	
}