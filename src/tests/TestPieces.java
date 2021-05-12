package tests;

import composants.Piece;
import grafix.interfaceGraphique.IG;

public class TestPieces {

	public static void main(String[] args) {
		// 1. Dans un premier temps, les param�tres du jeu seront saisis. Dans la suite nous supposerons que les param�tres par d�faut ont �t� saisis par l'utilisateur.
		int taillePlateau = 7;
		
		Object parametres[];
		parametres=IG.saisirParametres();
		
		int nbJoueurs=((Integer)parametres[0]).intValue();
		IG.creerFenetreJeu("D�mo Librairie IG version 1.9",nbJoueurs);
		IG.rendreVisibleFenetreJeu();
		
		IG.changerNomJoueur(0, (String)parametres[1] +" ("+ (String)parametres[2] +")");
		IG.changerImageJoueur(0,((Integer)parametres[3]).intValue());
		IG.changerNomJoueur(1, (String)parametres[4] +" ("+ (String)parametres[5] +")");
		IG.changerImageJoueur(1,((Integer)parametres[6]).intValue());
		IG.changerNomJoueur(2, (String)parametres[7] +" ("+ (String)parametres[8] +")");
		IG.changerImageJoueur(2,((Integer)parametres[9]).intValue());

		// 2. Une fois les param�tres saisis, le programme ouvrira la fen�tre de jeu avec une configuration initiale correspondant � un affichage par d�faut sauf pour le message affich� qui sera "Cliquez pour continuer ...". Le programme attendra un clic de souris de l'utilisateur.
		String message[]={
				"",
				"Cliquez pour continuer �",
				""
		};
		IG.afficherMessage(message);
		IG.miseAJourAffichage();
		IG.attendreClic();
		
		// 3. Puis, le programme g�n�rera � l'aide de la m�thode Piece.nouvellesPieces un tableau de 50 pi�ces. Les 49 premi�res pi�ces de ce tableau seront dispos�es sur le plateau dans l'ordre (la premi�re pi�ce sera plac�e sur la premi�re case de la premi�re ligne, la deuxi�me pi�ce sera plac�e sur la deuxi�me case de la premi�re ligne, ...). La derni�re pi�ce du tableau (celle � l'indice 49) sera plac�e dans l'emplacement de la fen�tre correspondant � la pi�ce hors du plateau. Le programme affichera cette nouvelle configuration dans la fen�tre de jeu et attendra de nouveau un clic de l'utilisateur.
		Piece[] pieces = Piece.nouvellesPieces();
		int g = 0;
		//for (int g = 0; g <= 49;g++) {
		for(int i = 0; i <= taillePlateau - 1; i++) {
			for(int j = 0; j < taillePlateau; j++) {
				IG.changerPiecePlateau(i, j, pieces[g].getModelePiece(), pieces[g].getOrientationPiece());
				g = g + 1;
				
			}
		}
		IG.changerPieceHorsPlateau(pieces[49].getModelePiece(), pieces[49].getOrientationPiece());
		
		IG.miseAJourAffichage();
		IG.attendreClic();
		
		// 4. Dans la suite de l'ex�cution du programme, l'utilisateur cliquera 4 fois. Apr�s chaque clic, l'ensemble des pi�ces du tableau sont rotationn�es puis de nouveau affich�es. De plus, la repr�sentation sous forme de cha�ne de caract�res de la pi�ce hors plateau est affich�e dans la console apr�s chaque clic. Le programme s'arr�tera apr�s un cinqui�me clic de l'utilisateur.
		int z = 0;
		while (z <= 51) {
			pieces[z].rotation();
			z++;
		}
		int k = 0;
		for(int i = 0; i <= taillePlateau - 1; i++) {
			for(int j = 0; j < taillePlateau; j++) {
				IG.changerPiecePlateau(i, j, pieces[k].getModelePiece(), pieces[k].getOrientationPiece());
				k = k + 1;
				
			}
		}
		
		IG.miseAJourAffichage();
		IG.attendreClic();
		
		for(int i = 0; i <= pieces.length; i++) pieces[i].rotation();
		int m = 0;
		for(int i = 0; i <= taillePlateau - 1; i++) {
			for(int j = 0; j < taillePlateau; j++) {
				IG.changerPiecePlateau(i, j, pieces[m].getModelePiece(), pieces[m].getOrientationPiece());
				m = m + 1;
				
			}
		}
		
		IG.miseAJourAffichage();
		IG.attendreClic();
		
		for(int i = 0; i <= pieces.length; i++) pieces[i].rotation();
		int n = 0;
		for(int i = 0; i <= taillePlateau - 1; i++) {
			for(int j = 0; j < taillePlateau; j++) {
				IG.changerPiecePlateau(i, j, pieces[n].getModelePiece(), pieces[n].getOrientationPiece());
				n = n + 1;
				
			}
		}
		
		IG.miseAJourAffichage();
		IG.attendreClic();
		
		for(int i = 0; i <= pieces.length; i++) pieces[i].rotation();
		int b = 0;
		for(int i = 0; i <= taillePlateau - 1; i++) {
			for(int j = 0; j < taillePlateau; j++) {
				IG.changerPiecePlateau(i, j, pieces[b].getModelePiece(), pieces[b].getOrientationPiece());
				b = b + 1;
				
			}
		}
		
		IG.miseAJourAffichage();
		IG.attendreClic();
	}
		
}
