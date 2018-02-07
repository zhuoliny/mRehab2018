package com.example.matt2929.strokeappdec2017.Values;

import android.graphics.Color;

import com.example.matt2929.strokeappdec2017.SaveAndLoadData.User;
import com.example.matt2929.strokeappdec2017.Workouts.WorkoutDescription;

/**
 * Created by matt2929 on 12/18/17.
 */

public final class WorkoutData {

	public static final String Workout_Type_Sensor = "Workout Sensor";
	public static final String Workout_Type_Touch = "Workout Touch";
	public static final String Sensor_Type_Linear = "Sensor Linear";
	public static final String Sensor_Type_Gravity = "Sensor Gravity";

	public static final String Print_Container_Cup = "Print Cup";
	public static final String Print_Container_Bowl = "Print Bowl";
	public static final String Print_Container_Key = "Print Key";
	public static final String Print_Container_Door = "Print Door";
	public static final String Print_Container_No_Container = "No Container";

	public static final String Key_Last_Goal_Set = "Last Goal Set";

	public final static WorkoutDescription[] WORKOUT_DESCRIPTIONS = new WorkoutDescription[]
			{
					new WorkoutDescription("Horizontal Bowl", Workout_Type_Sensor, Sensor_Type_Linear, Print_Container_Bowl, 10,
							"Move the bowl with two hands from one side of the panel to the other. Set the bowl\n" +
									"on the table and wait for me to count. Then, move the bowl again.",
							Color.rgb(51, 204, 255)),
					new WorkoutDescription("Vertical Bowl", Workout_Type_Sensor, Sensor_Type_Linear, Print_Container_Bowl, 10,
							"With two hands, move the bowl onto the top of the box and wait for me to count. Then\n" +
									"return the bowl to the table and wait for me to count again.",
							Color.rgb(102, 255, 153)),
					new WorkoutDescription("Horizontal Mug", Workout_Type_Sensor, Sensor_Type_Linear, Print_Container_Cup, 10,
							"You will move the mug from one side of the panel to the other. Set the mug on the table and wait for me to count. Then, move the mug again.",
							Color.rgb(177, 178, 21)),
					new WorkoutDescription("Vertical Mug", Workout_Type_Sensor, Sensor_Type_Linear, Print_Container_Cup, 10,
							"Lift the mug and place it on the top of the box and wait for me to count. Then return the\n" +
									"mug to the table and wait for me to count again.",
							Color.rgb(33, 103, 52)),
					new WorkoutDescription("Walk with mug", Workout_Type_Sensor, Sensor_Type_Linear, Print_Container_Bowl, 10,
							"Hold the mug with one hand. Walk forward at a comfortable pace. Walk until I tell you\n" +
									"to stop.",
							Color.rgb(255, 153, 102)),
					new WorkoutDescription("Sip From The Mug", Workout_Type_Sensor, Sensor_Type_Gravity, Print_Container_Cup, 1,
							"Lift the mug from the table and bring it close to your mouth as if you are going to\n" +
									"take a sip. Hold it there until I tell you to stop.",
							Color.rgb(255, 80, 80)),
					new WorkoutDescription("Quick Twist Mup", Workout_Type_Sensor, Sensor_Type_Linear, Print_Container_Cup, 10,
							"Hold the mug in front of you in an upright position. As quickly as you can turn your\n" +
									"hand outward and then return to the upright position.",
							Color.rgb(255, 51, 153)),
					new WorkoutDescription("Slow Pour", Workout_Type_Sensor, Sensor_Type_Gravity, Print_Container_Cup, 3,
							"Hold the mug in front of you and move as if to slowly pour out water.\n" +
									"[If pouring too quickly - “you are pouring too quickly – please bring the mug to an upright position and\n" +
									"start pouring again”]",
							Color.rgb(255, 153, 255)),
					new WorkoutDescription("Unlock With Key", Workout_Type_Touch, null, Print_Container_Key, 5,
							"With the key in contact with the phone screen, rotate the key clockwise and wait for\n" +
									"me to count. Then rotate it counterclockwise, and wait for me to count again.",
							Color.rgb(153, 153, 255)),
					new WorkoutDescription("Turn Doorknob", Workout_Type_Touch, null, Print_Container_Door, 5,
							"With the doorknob in contact with the phone screen, rotate the doorknob clockwise\n" +
									"and wait for me to count. Then rotate it counterclockwise, and wait for me to count again.",
							Color.rgb(153, 102, 51)),
					new WorkoutDescription("Phone Number", Workout_Type_Touch, null, Print_Container_No_Container, 3,
							"Hold the phone in your hand. Type in the phone number shown on the screen as\n" +
									"accurately and quickly as possible.",
							Color.rgb(51, 153, 102)),
					new WorkoutDescription("Quick Tap", Workout_Type_Touch, null, Print_Container_No_Container, 5,
							"Tap all of the blue circles as quickly as possible. Use multiple fingers if you can.",
							Color.rgb(153, 51, 102)),
			};

	public static final String TTS_WORKOUT_DESCRIPTION = "WORKOUT_DESCRIPTION"; //Say workout description
	public static final String TTS_WORKOUT_READY = "WORKOUT_READY";//Say Ready then have some delay
	public static final String TTS_WORKOUT_BEGIN = "WORKOUT_BEGIN";//Say Begin
	public static final String TTS_WORKOUT_COMPLETE = "WORKOUT_COMPLETE";//Say SensorWorkoutAbstract complete then give post workout feedback
	public static final String TTS_WORKOUT_AUDIO_FEEDBACK = "WORKOUT_FEEDBACK";//Give mid workout feedback
	public static final String TEST = "TEST";
	public static String UserName = "";
	public static User UserData = null;
	public static Float progressLocal = 0f;
	public static Float progressCloud = 0f;
}
