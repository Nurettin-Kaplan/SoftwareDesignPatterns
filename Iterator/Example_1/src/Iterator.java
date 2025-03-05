public abstract class Iterator {
    public abstract void First();   /* imleci ilk elemana getirir */
    public abstract void Next();    /* imleci bir sonraki elemana getirir */
    public abstract boolean IsDone();  /* koleksiyonun sonuna geldik */
    public abstract int CurrentItem(); /* imlecin şimdi gösterdiği değeri döndürür */
}
