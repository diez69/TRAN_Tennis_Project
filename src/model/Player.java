package model;

public class Player {
    private String _name;
    private int _position;
    private Points _points;
    private int _setsWon;
    private int _gamesWonOnCurrentSet;

    //-----CONSTRUCTOR-----//
    public Player(String name, int position) {
        _name = name;
        _position = position;
        _points = Points.ZERO;
        _setsWon = 0;
        _gamesWonOnCurrentSet = 0;
    }

    //-----GETTER-----//
    public String get_name() {
        return _name;
    }
    public Points get_points() {
        return _points;
    }
    public int get_setsWon() {
        return _setsWon;
    }
    public int get_gamesWonOnCurrentSet() {
        return _gamesWonOnCurrentSet;
    }
    public int get_position() {
        return _position;
    }

    //-----SETTER-----//
    public void set_name(String _name) {
        this._name = _name;
    }
    public void set_points(Points _points) {
        this._points = _points;
    }
    public void set_setsWon(int _setsWon) {
        this._setsWon = _setsWon;
    }
    public void set_gamesWonOnCurrentSet(int _gamesWonOnCurrentSet) {
        this._gamesWonOnCurrentSet = _gamesWonOnCurrentSet;
    }
}
