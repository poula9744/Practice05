package com.javaex.ex03;

public class SongApp {

	public static void main(String[] args){
		
		Song s1 = new Song("좋은 날", "아이유", "Real", "이민수", "2010", 3);
		
		
	}

}

/*
[예상]
Song(파라미터5개)  
Song(파라미터6개)

s1은 title, artist, album, composer, year, track 
파라미터 6개를 사용한다.
따라서 세 번째 생성자를 사용하게 되는데, 

this(title, artist, album, composer, year);가 
앞에 있는 두 번째 생성자를 호출하여 
Song(파라미터5개)가 출력되고
그 후에 track을 읽고, Song(파라미터6개)가 출력된다.

 */
