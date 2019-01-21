package etc.woowa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

//TODO: 내부클래스/이중클래스, 개행문자(LineSeparator, \n, \r\n), String 기준 sorting, Capitalize 학습
//17:21 ~ 18:04, 18:36 ~ 20:14
public class WWSecond {
    List<Line> lines;
    public String solution(String S) {
        List<Line> lines = new ArrayList<>();
        for (String line : S.split("\n")) {
            lines.add(new Line(line));
        }

        Map<String, Integer> numberOfCities = new HashMap<>();


        for (Line line : lines) {
            numberOfCities.put(line.getCity(), numberOfCities.getOrDefault(line.getCity(), 0) + 1);
        }

        for (String city : numberOfCities.keySet()) {
            List<Long> eachCitiesTime = lines.stream()
                    .filter(l -> l.getCity().equals(city))
                    .map(Line::getCreateTime)
                    .sorted()
                    .collect(Collectors.toList());

            for (Line line : lines) {
                if(line.getCity().equals(city)) {
                    for (int i = 0; i < eachCitiesTime.size(); i++) {
                        if (line.getCreateTime() == eachCitiesTime.get(i)) {
                            if(numberOfCities.get(city) >= 10) {
                                line.setIndex(String.format("%02d", i + 1));
                            } else {
                                line.setIndex(String.valueOf(i + 1));
                            }
                        }
                    }
                }
            }
        }

        StringBuilder result = new StringBuilder();

        result.append(lines.get(0).getResult());

        for (int i = 1; i < lines.size(); i++) {
            result.append("\n").append(lines.get(i).getResult());
        }

        return result.toString();
    }
}

class Line {
    private String extension;
    private String city;
    private long createTime;
    private String index;

    Line(String line) {
        this.extension = line.split(",")[0].split("\\.")[1];
        this.city = line.split(",")[1].trim();
        updateCity();
        this.createTime = parseTime(line);
    }

    private void updateCity() {
        this.city = city.substring(0, 1).toUpperCase() + city.substring(1);
    }

    public String getResult() {
        return city + index + "." + extension;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getCity() {
        return city;
    }

    public long getCreateTime() {
        return createTime;
    }

    private long parseTime(String line) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date temp = null;
        try {
            temp = dateFormat.parse(line.split(",")[2].trim());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return temp.getTime();
    }
}