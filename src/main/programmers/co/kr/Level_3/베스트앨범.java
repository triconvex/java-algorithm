package programmers.co.kr.Level_3;

import org.junit.Assert;
import org.testng.annotations.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 베스트앨범 {
    public int[] solution(String[] genres, int[] plays) {
        List<Integer> answer = new ArrayList<>();
        List<Album> albums = new ArrayList<>();

        for (int i = 0; i < genres.length; i++) {
            albums.add(new Album(i, genres[i], plays[i]));
        }

        HashMap<String, Integer> playsByGenres = new HashMap<>();
        for (Album album : albums) {
            if(!playsByGenres.containsKey(album.getGenre())) {
                playsByGenres.put(album.getGenre(), album.getPlayTime());
            } else {
                playsByGenres.put(album.getGenre(), playsByGenres.get(album.getGenre()) + album.getPlayTime());
            }

        }

        Iterator albumsByGenres = sortByValue(playsByGenres).iterator();

        while(albumsByGenres.hasNext()) {
            String genre = (String) albumsByGenres.next();
            System.out.println(genre);
            List<Album> temp = albums.stream()
                    .filter(a -> a.getGenre().equals(genre))
                    .sorted(Comparator.comparing(Album::getPlayTime).reversed())
                    .limit(2)
                    .collect(Collectors.toList());

            for (Album album : temp) {
                answer.add(album.getId());
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    private static List sortByValue(final Map map) {
        ArrayList list = new ArrayList(map.keySet());

        list.sort((Comparator) (o1, o2) -> {
            Object v1 = map.get(o1);
            Object v2 = map.get(o2);
            return ((Comparable) v2).compareTo(v1);
        });

        Collections.reverse(list); // 주석시 오름차순
        return list;
    }

    @Test
    private void test() {
        String[] genres = {"classic","pop","classic","classic","classic"};
        int[] plays = {400,600,150,500,500};
        int[] returns = {1,3,4};

        Assert.assertArrayEquals(solution(genres, plays), returns);
    }
}

class Album {

    private int id;
    private String genre;
    private int playTime;

    public Album(int id, String genre, int playTime) {
        this.id = id;
        this.genre = genre;
        this.playTime = playTime;
    }

    public int getId() {
        return id;
    }

    public String getGenre() {
        return genre;
    }

    public int getPlayTime() {
        return playTime;
    }
}

//--------------------------------------------------------------------

class 참고할만한_풀이 {
    public class Music implements Comparable<Music>{

        private int played;
        private int id;
        private String genre;

        public Music(String genre, int played, int id) {
            this.genre = genre;
            this.played = played;
            this.id = id;
        }

        @Override
        public int compareTo(Music other) {
            if(this.played == other.played) return this.id - other.id;
            return other.played - this.played;
        }

        public String getGenre() {return genre;}
    }

    public int[] solution(String[] genres, int[] plays) {
        return IntStream.range(0, genres.length)
                .mapToObj(i -> new Music(genres[i], plays[i], i))
                .collect(Collectors.groupingBy(Music::getGenre))
                .entrySet().stream()
                .sorted((a, b) -> sum(b.getValue()) - sum(a.getValue()))
                .flatMap(x->x.getValue().stream().sorted().limit(2))
                .mapToInt(x->x.id).toArray();
    }

    private int sum(List<Music> value) {
        int answer = 0;
        for (Music music : value) {
            answer+=music.played;
        }
        return answer;
    }
}