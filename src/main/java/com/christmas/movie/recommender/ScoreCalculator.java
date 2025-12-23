<<<<<<< HEAD
package com.christmas.movie.recommender;

import com.christmas.movie.movie.Genre;
=======
package main.java.com.christmas.movie.recommender;

>>>>>>> c5376105d07a9f36f1b445fd0d3e6d7fad43bf31
public class ScoreCalculator {

    public static void calculateScore(UserProfile profile,
                                      int questionNum,
                                      String answer) {

        answer = answer.toLowerCase();

        switch (questionNum) {

            case 1:
                if (answer.equals("a")) {
                    profile.addScore(Genre.ROMANCE, 2);
                    profile.addScore(Genre.COMEDY, 1);
                } else if (answer.equals("b")) {
                    profile.addScore(Genre.FAMILY, 2);
                    profile.addScore(Genre.HEALING, 1);
                } else if (answer.equals("c")) {
                    profile.addScore(Genre.COMEDY, 2);
                    profile.addScore(Genre.ACTION, 1);
                } else if (answer.equals("d")) {
                    profile.addScore(Genre.FANTASY, 2);
                    profile.addScore(Genre.MUSICAL, 1);
                }
                break;

            case 2:
                if (answer.equals("a")) {
                    profile.addScore(Genre.ANIMATION, 2);
                    profile.addScore(Genre.FANTASY, 2);
                } else if (answer.equals("b")) {
                    profile.addScore(Genre.MYSTERY, 2);
                    profile.addScore(Genre.HORROR, 1);
                    profile.addScore(Genre.ACTION, 1);
                } else if (answer.equals("c")) {
                    profile.addScore(Genre.ACTION, 2);
                    profile.addScore(Genre.FANTASY, 1);
                } else if (answer.equals("d")) {
                    profile.addScore(Genre.HEALING, 2);
                    profile.addScore(Genre.ROMANCE, 1);
                    profile.addScore(Genre.FAMILY, 1);
                }
                break;

            case 3:
                if (answer.equals("a")) {
                    profile.addScore(Genre.MUSICAL, 2);
                    profile.addScore(Genre.HORROR, 1);
                } else if (answer.equals("b")) {
                    profile.addScore(Genre.FANTASY, 2);
                    profile.addScore(Genre.MYSTERY, 1);
                } else if (answer.equals("c")) {
                    profile.addScore(Genre.ANIMATION, 2);
                } else if (answer.equals("d")) {
                    profile.addScore(Genre.HEALING, 1);
                    profile.addScore(Genre.FAMILY, 1);
                }
                break;

            case 4:
                if (answer.equals("a")) {
                    profile.addScore(Genre.MYSTERY, 2);
                } else if (answer.equals("b")) {
                    profile.addScore(Genre.COMEDY, 2);
                } else if (answer.equals("c")) {
                    profile.addScore(Genre.ROMANCE, 1);
                    profile.addScore(Genre.HEALING, 1);
                } else if (answer.equals("d")) {
                    profile.addScore(Genre.ANIMATION, 2);
                }
                break;

            case 5:
                if (answer.equals("a")) {
                    profile.addScore(Genre.HEALING, 2);
                } else if (answer.equals("b")) {
                    profile.addScore(Genre.MYSTERY, 2);
                } else if (answer.equals("c")) {
                    profile.addScore(Genre.ACTION, 1);
                    profile.addScore(Genre.COMEDY, 1);
                } else if (answer.equals("d")) {
                    profile.addScore(Genre.FAMILY, 2);
                }
                break;

            case 6:
                if (answer.equals("a")) {
                    profile.addScore(Genre.ROMANCE, 2);
                } else if (answer.equals("b")) {
                    profile.addScore(Genre.FAMILY, 2);
                } else if (answer.equals("c")) {
                    profile.addScore(Genre.COMEDY, 2);
                } else if (answer.equals("d")) {
                    profile.addScore(Genre.HEALING, 2);
                }
                break;

            case 7:
                if (answer.equals("a")) {
                    profile.addScore(Genre.HEALING, 2);
                } else if (answer.equals("b")) {
                    profile.addScore(Genre.MYSTERY, 2);
                } else if (answer.equals("c")) {
                    profile.addScore(Genre.HORROR, 2);
                } else if (answer.equals("d")) {
                    profile.addScore(Genre.ACTION, 2);
                }
                break;

            case 8:
                if (answer.equals("a")) {
                    profile.addScore(Genre.FAMILY, 2);
                } else if (answer.equals("b")) {
                    profile.addScore(Genre.FANTASY, 2);
                } else if (answer.equals("c")) {
                    profile.addScore(Genre.MUSICAL, 2);
                } else if (answer.equals("d")) {
                    profile.addScore(Genre.HEALING, 2);
                }
                break;

            case 9:
                if (answer.equals("a")) {
                    profile.addScore(Genre.ROMANCE, 2);
                } else if (answer.equals("b")) {
                    profile.addScore(Genre.COMEDY, 2);
                } else if (answer.equals("c")) {
                    profile.addScore(Genre.FAMILY, 1);
                    profile.addScore(Genre.HEALING, 1);
                } else if (answer.equals("d")) {
                    profile.addScore(Genre.MYSTERY, 2);
                }
                break;

            case 10:
                if (answer.equals("a")) {
                    profile.addScore(Genre.ROMANCE, 3);
                } else if (answer.equals("b")) {
                    profile.addScore(Genre.COMEDY, 3);
                } else if (answer.equals("c")) {
                    profile.addScore(Genre.FAMILY, 3);
                } else if (answer.equals("d")) {
                    profile.addScore(Genre.HEALING, 3);
                }
                break;
        }
    }
}
