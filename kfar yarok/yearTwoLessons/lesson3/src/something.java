public class something {
    public static int whoAppearsMost(int[] arr) {
        int maxAppearanceAmount = 0;
        int numAppearsMost = 0;
        int currentAppearnceAmount = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                if(arr[i]==arr[j]) {
                    currentAppearnceAmount++;
                }
            }
            if (currentAppearnceAmount > maxAppearanceAmount) {
                maxAppearanceAmount = currentAppearnceAmount;
                numAppearsMost = arr[i];
            }
        }
        return numAppearsMost;
    }

    public static void main(String[] args) {
        int[] arr = {1,7,2,5,1,1,1,1,1,1,2};
        System.out.println(whoAppearsMost(arr));
    }
}
