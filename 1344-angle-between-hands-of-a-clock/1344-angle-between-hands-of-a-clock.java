class Solution {
public double angleClock(int hour, int minutes) {
    // Convert 12-hour format to 0 for calculation (e.g., 12:00 becomes 0:00)
    if (hour == 12) {
        hour = 0;
    }
    
    // Calculate the position of the hour hand in degrees
    // Each hour is 30 degrees, plus 0.5 degrees per minute
    double hourAngle = (hour * 30.0) + (minutes * 0.5);
    
    // Calculate the position of the minute hand in degrees
    // Each minute is 6 degrees
    double minuteAngle = minutes * 6.0;
    
    // Find the absolute difference between the two hands
    double angle = Math.abs(hourAngle - minuteAngle);
    
    // Return the smaller angle (cannot exceed 180 degrees)
    return Math.min(angle, 360.0 - angle);
}

}