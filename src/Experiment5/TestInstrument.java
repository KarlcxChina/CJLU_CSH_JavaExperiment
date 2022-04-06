package Experiment5;

//E5T3
public class TestInstrument
    {
        public static void main(String[] args)
            {
                Erhu erhu = new Erhu();
                Violin violin = new Violin();
                Piano piano = new Piano();
                System.out.println("Player：Bob");
                Musician bob = new Musician("Bob");
                bob.play(erhu);
                bob.play(violin);
                bob.play(piano);
                System.out.println("Instrument：Piano");
                Musician tom = new Musician("tom");
                tom.play(piano);
                Musician jerry = new Musician("jerry");
                jerry.play(piano);
                Musician mickey = new Musician("mickey");
                mickey.play(piano);
                Musician pluto = new Musician("pluto");
                pluto.play(piano);
                Musician goofy = new Musician("goofy");
                goofy.play(piano);
            }
    }

class Musician
    {
        private String name;

        Musician(String name)
            {
                this.name = name;
            }

        public String getName()
            {
                return name;
            }

        public void setName(String name)
            {
                this.name = name;
            }

        public void play(Instrument i)
            {
                System.out.print(getName() + " is playing" + i.getName() + "，");
                i.makeSound();
            }
    }

abstract class Instrument
    {
        protected String name;

        Instrument()
            {
                name = "";
            }

        Instrument(String name)
            {
                this.name = name;
            }

        public String getName()
            {
                return name;
            }

        public abstract void makeSound();
    }

class Erhu extends Instrument
    {
        Erhu()
            {
                super("Erhu");
            }

        public void makeSound()
            {
                System.out.println("二胡在叫");
            }
    }

class Piano extends Instrument
    {
        Piano()
            {
                super("Piano");
            }

        public void makeSound()
            {
                System.out.println("钢琴在叫");
            }
    }

class Violin extends Instrument
    {
        Violin()
            {
                super("Violin");
            }

        public void makeSound()
            {
                System.out.println("小提琴在叫");
            }
    }