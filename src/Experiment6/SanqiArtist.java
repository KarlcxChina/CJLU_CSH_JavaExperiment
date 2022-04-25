package Experiment6;

//E6T4
interface AM
    {
        void actInMovie();
    }

interface AT
    {
        void actInTV();
    }

interface AS
    {
        void sing();
    }

public class SanqiArtist implements AM, AT, AS
    {
        private String name;

        public SanqiArtist(String name)
            {
                this.name = name;
            }

        public String getName()
            {
                return name;
            }

        public void act(String str)
            {
                System.out.println(str);
            }

        public void actInMovie()
            {
                act("我能演电影");
            }

        public void actInTV()
            {
                act("我能演电视剧");
            }

        public void sing()
            {
                act("歌舞台上我也能唱");
            }

        public void actMe()
            {
                act("我的名字是" + getName());
                actInMovie();
                actInTV();
                sing();
            }

        public static void main(String[] args)
            {
                SanqiArtist am = new SanqiArtist("marry");
                am.actMe();
                SanqiArtist aj = new SanqiArtist("Jack");
                aj.actMe();
            }
    }
