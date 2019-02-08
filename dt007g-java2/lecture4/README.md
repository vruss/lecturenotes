## Föreläsning 5

extend - "jag tar både dess beteende och beståndsdelar"

implements - "jag följder de kontrakt som finns definierad för ett interface"

### ActionListeners

Att implementera ett interface
- Frisående klass (implements)
- Inre klass
- Inre statisk klass
- Anonym inre klass (en klass utan namn och används bara för abstrakta klasser)
- Lambda (instans av anonym inre klass med en metod och funkar när det bara finns en metod i interface)

@Override kallas för en annotation. Syftet med den är att ge instruktioner till kompilatorn. 


```java
Händelseproducent
Button b {
	List<ActionListener> listernerList
}

ActionListener 
Konsument

ButtonPanel {
	Button b = new...
	b,addActionListener(lyssnare);
}
```