package me.cyberproton;

public class MyPair<T, U> {
    public final T Fst;
    public final U Snd;

    public MyPair(T Fst, U Snd) {
        this.Fst = Fst;
        this.Snd = Snd;
    }

    public String toString() {
        return "(" + Fst + ", " + Snd + ")";
    }
}
