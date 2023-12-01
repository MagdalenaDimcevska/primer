package Konstruktori;

import Konstruktori.Kvadar;
public class Kvadar {
int dolzina;
int visina;
int sirina;
public int getVolumen() {
	return(dolzina*visina*sirina);
}
	Kvadar(){
	dolzina=3;
	visina=3;
	sirina=4;
	}
	Kvadar(int d,int v,int s){
		dolzina=d;
		visina=v;
		sirina=s;
	}
	public class Glavna{
		public static void main(String[]args) {
			Kvadar k1=new Kvadar();
			System.out.println("Volumen"+k1.getVolumen());
			Kvadar k2=new Kvadar(2,2,2);
			System.out.println("Volumen2"+k2.getVolumen());
		}
	}}