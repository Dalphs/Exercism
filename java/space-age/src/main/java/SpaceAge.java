class SpaceAge {
    double seconds;
    final int EARTH_YEAR = 31557600;

    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    double getSeconds() {
        return seconds;
    }

    double onEarth() {
        return seconds / EARTH_YEAR;
    }

    double onMercury() {
        return seconds / EARTH_YEAR / 0.2408467;
    }

    double onVenus() {
        return seconds / EARTH_YEAR / 0.61519726;    }

    double onMars() {
        return seconds / EARTH_YEAR / 1.8808158 ;    }

    double onJupiter() {
        return seconds / EARTH_YEAR / 11.862615;    }

    double onSaturn() {
        return seconds / EARTH_YEAR / 29.447498;    }

    double onUranus() {
        return seconds / EARTH_YEAR /  84.016846;    }

    double onNeptune() {
        return seconds / EARTH_YEAR / 164.79132;    }

}
