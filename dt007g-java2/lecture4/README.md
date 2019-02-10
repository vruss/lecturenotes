## Föreläsning 5
* klassifikation beskriver beteende.
* komposition beståndsdelarna.
* extends tar både beteende och beståndsdelarna.
* en klass kan extendas ett interface kan implements. 
* ett interface har alla medlemmar publika.
* en actionlistener behöver tydligt ha vilket objekt som ska användas.
* ordningen ska inte spela roll när man ligger till font och bakgrund till en knapp.
* Det är önskvärt att grafiska komponenter ska inte känner till varandra.
* Många enkla klasser över få komplicerade klasser.
@ovveride är en annotation vilket är en klass. Det talar om att vi vill använda vår egna metod istället för den redan existerande metoden.

* En statsik metod kräver ingen instans.
* Klasser är ofta statiska kontexter.
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
