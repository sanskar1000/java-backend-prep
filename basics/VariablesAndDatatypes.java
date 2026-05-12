/**
 * ------------------------------------------------------------
 * Program Name : WeatherVariablesDemo
 * Topic        : Variables & Data Types
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates the use
 * of integer and decimal variables in Java.
 *
 * Weather-related information such as:
 * - temperature
 * - humidity
 * - wind speed
 *
 * is stored and displayed.
 *
 * Concepts Used:
 * - int datatype
 * - double datatype
 * - variables
 * - output statements
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

package basics;

public class WeatherVariablesDemo {

    public static void main(String[] args) {

        // 🔹 Integer variables
        int temperature = 28;
        int humidity = 65;
        int windSpeed = 15;

        // 🔹 Decimal variables
        double morningTemp = 22.5;
        double afternoonTemp = 28.8;
        double eveningTemp = 23.4;

        // 🔹 Output
        System.out.println("Current Temperature: " + temperature + "°C");
        System.out.println("Humidity Level: " + humidity + "%");
        System.out.println("Wind Speed: " + windSpeed + " km/h");

        System.out.println("Morning Temperature: " + morningTemp + "°C");
        System.out.println("Afternoon Temperature: " + afternoonTemp + "°C");
        System.out.println("Evening Temperature: " + eveningTemp + "°C");
    }
}
