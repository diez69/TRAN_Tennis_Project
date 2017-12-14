package model;

import java.util.ArrayList;
import java.util.List;

public class TennisMatch {
    private Player _player1;
    private Player _player2;
    private MatchType _typeOfMatch;
    private List<Points> _listPoints;
    private boolean _tieBreak;

    public TennisMatch(Player _player1, Player _player2, MatchType _typeOfMatch, boolean _tieBreak) {
        this._player1 = _player1;
        this._player2 = _player2;
        this._typeOfMatch = _typeOfMatch;
        _listPoints = new ArrayList<Points>();
        _listPoints.add(Points.ZERO);
        _listPoints.add(Points.ZERO);
        this._tieBreak = _tieBreak;
    }

    public void updateWithPointWonBy(Player player) {
        switch (player.get_points()) {
            case ZERO:
                player.set_points(Points.FIFTEEN);
                _listPoints.set(player.get_position(), player.get_points());
                break;
            case FIFTEEN:
                player.set_points(Points.THIRTY);
                _listPoints.set(player.get_position(), player.get_points());
                break;
            case THIRTY:
                player.set_points(Points.FORTY);
                _listPoints.set(player.get_position(), player.get_points());
                break;
            case FORTY:
                if (player.get_position() == 1) {
                    switch (_listPoints.get(2)) {
                        case FORTY:
                            player.set_points(Points.A);
                            _listPoints.set(1, player.get_points());
                            break;
                        case A:
                            //TODO : Passer les points du player 2 à 40
                            _listPoints.set(2, Points.FORTY);
                            break;
                        //TODO : 15 30 40
                    }
                }
                else {
                    //TODO : Pareil mais avec l'autre index
                }
                break;
        }
    }

    public String pointsForPlayer(Player player) {
        return player.get_points().getStringOfPoints();
    }

    public int currentSetNumber() {
        return (_player1.get_setsWon() + _player2.get_setsWon()) + 1;
    }

    public int gamesInCurrentSetForPlayer(Player player) {
        return player.get_gamesWonOnCurrentSet();
    }

    public int gamesInSetForPlayer(int numberOfSet, Player player) {
        return 0; //TODO
    }

    public boolean isFinished() {
        if ((_player1.get_setsWon() == _typeOfMatch.getNumberOfSetsToWin()) ||
        (_player2.get_setsWon() == _typeOfMatch.getNumberOfSetsToWin())) {
            return true;
        }
        else {
            return false;
        }
    }

}
