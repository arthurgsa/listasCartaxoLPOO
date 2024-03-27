public class Ex01 {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        int target = 3;
        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Target " + target + " found in the array.");
        } else {
            System.out.println("Target " + target + " not found in the array.");
        }
    
        int index = -1; // Initialize index to -1
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                index = i; // Store the index of the target
                break;
            }
        }
        System.out.println("Target " + target + " found at index: " + index);
    }
    }

    /* EXERCÍCIO RESOLVIDO:
    O código contido nas linhas 3 a 16 está correto e faz o que é pedido no enunciado, o número é obtido pela variável target, é procurado o número e ele é impresso.
    O código contido nas linhas 18 a 25 é desnecessário para o que é pedido, mas imprime -1 quando não há o alvo no array.

    -- CORREÇÃO:

    public class Ex01 {
        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5};
            int target = 3;
            boolean found = false;

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == target) {
                    found = true;
                    break;
                }
            }

            System.out.print(target);
        }
    }
    */
    