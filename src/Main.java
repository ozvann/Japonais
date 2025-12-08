public class Main{
	public static void Main (String[] args){
		int x = 0, choix = -1;
		int[] choix_possible = {0, 1, 2, 3, 4};
		System.out.println("Tu veux apprendre :\n   1/ Hiragana\n   2/ Katakana\n   3/ Kanji\n   4/ Tous\n   0/ Arret");
		while(choix != choix_possible[x]){
			x++;
			if(x > 4) x = 0;
			if(choix == 1){
				new Choix(choix);
			}else if (choix == 2){
				new Choix(choix);
			}else if (choix == 3){
				new Choix(choix);
			}else if (choix == 4){
				new Choix(choix);
			}else if (choix == 0){
				System.out.println("Arrêt du programme.");
				return;
			}else{
				System.out.println("Il faut que tu choisisse entre les différentes possibilité.");
				choix = -1;
			}
		}	
	}
}
