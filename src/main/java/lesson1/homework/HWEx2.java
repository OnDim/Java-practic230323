package lesson1.homework;
    //Дан массив nums = [3,2,2,3] и число val = 3.
    //Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
    //Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
public class HWEx2 {
        public static void main(String[] args) {
            int[] nums = new int[]{3, 2, 2, 3};
            int val = 3;
            int[] New = nums;

            for (int i = 0; i < nums.length; i++) {
                System.out.print(nums[i] + " ");
            }
            System.out.println();
            numtoend(New, nums, val);
        }

        public static void numtoend(int[] New, int[] nums, int val) {
            int j = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != val) {
                    New[j] = nums[i];
                    j++;
                }
            }
            for (int i = j; i < New.length; i++) {
                New[i] = val;
            }
            for (int i = 0; i < New.length; i++) {
                System.out.print(New[i] + " ");
            }
        }
    }

