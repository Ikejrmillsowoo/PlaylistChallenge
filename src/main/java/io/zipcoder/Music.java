package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        Integer answer = 0;
        for (int i = 0; i < playList.length; i++) {
            if (playList[i].equals(selection)){
               answer = Math.min(((playList.length + startIndex) - i), (i - startIndex));
            }
        }


        return answer;
    }
}
