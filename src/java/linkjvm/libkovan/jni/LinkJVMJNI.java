/*
* This file is part of LinkJVM.
*
* Java Framework for the KIPR Link
* Copyright (C) 2013 Markus Klein<m@mklein.co.at>
*
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with this program. If not, see <http://www.gnu.org/licenses/>.
*/

/*
* IMPORTANT!!!
* Do not make changes to this file unless you know what you are doing--modify
* the SWIG interface file instead.
*/



package linkjvm.libkovan.jni;

public class LinkJVMJNI {
  public final static native int drone_connect();
  public final static native void drone_disconnect();
  public final static native void drone_calibrate();
  public final static native int get_drone_version();
  public final static native void drone_takeoff();
  public final static native void drone_land();
  public final static native int get_drone_battery();
  public final static native void drone_clear_position();
  public final static native float get_drone_x();
  public final static native float get_drone_y();
  public final static native float get_drone_z();
  public final static native float get_drone_x_velocity();
  public final static native float get_drone_y_velocity();
  public final static native float get_drone_z_velocity();
  public final static native float get_drone_pitch();
  public final static native float get_drone_roll();
  public final static native float get_drone_altitude();
  public final static native float get_drone_yaw();
  public final static native int drone_camera_open(int jarg1);
  public final static native int set_drone_mac_address(String jarg1);
  public final static native int drone_pair();
  public final static native int set_drone_ssid(String jarg1);
  public final static native void drone_move(float jarg1, float jarg2, float jarg3, float jarg4);
  public final static native void drone_hover();
  public final static native void set_drone_emergency_stop_enabled(int jarg1);
  public final static native int get_drone_emergency_stop_enabled();
  public final static native void beep();
  public final static native int get_motor_position_counter(int jarg1);
  public final static native void clear_motor_position_counter(int jarg1);
  public final static native int move_at_velocity(int jarg1, int jarg2);
  public final static native int mav(int jarg1, int jarg2);
  public final static native int move_to_position(int jarg1, int jarg2, int jarg3);
  public final static native int mtp(int jarg1, int jarg2, int jarg3);
  public final static native int move_relative_position(int jarg1, int jarg2, int jarg3);
  public final static native int mrp(int jarg1, int jarg2, int jarg3);
  public final static native void set_pid_gains(int jarg1, short jarg2, short jarg3, short jarg4, short jarg5, short jarg6, short jarg7);
  public final static native void get_pid_gains(int jarg1, long jarg2, long jarg3, long jarg4, long jarg5, long jarg6, long jarg7);
  public final static native int freeze(int jarg1);
  public final static native int get_motor_done(int jarg1);
  public final static native void block_motor_done(int jarg1);
  public final static native void bmd(int jarg1);
  public final static native int setpwm(int jarg1, int jarg2);
  public final static native int getpwm(int jarg1);
  public final static native void fd(int jarg1);
  public final static native void bk(int jarg1);
  public final static native void motor(int jarg1, int jarg2);
  public final static native void off(int jarg1);
  public final static native void alloff();
  public final static native void ao();
  public final static native void enable_servo(int jarg1);
  public final static native void disable_servo(int jarg1);
  public final static native void enable_servos();
  public final static native void disable_servos();
  public final static native void set_servo_enabled(int jarg1, int jarg2);
  public final static native int get_servo_enabled(int jarg1);
  public final static native int get_servo_position(int jarg1);
  public final static native void set_servo_position(int jarg1, int jarg2);
  public final static native void set_a_button_text(String jarg1);
  public final static native void set_b_button_text(String jarg1);
  public final static native void set_c_button_text(String jarg1);
  public final static native void set_x_button_text(String jarg1);
  public final static native void set_y_button_text(String jarg1);
  public final static native void set_z_button_text(String jarg1);
  public final static native int a_button();
  public final static native int b_button();
  public final static native int c_button();
  public final static native int x_button();
  public final static native int y_button();
  public final static native int z_button();
  public final static native int side_button();
  public final static native int black_button();
  public final static native int a_button_clicked();
  public final static native int b_button_clicked();
  public final static native int c_button_clicked();
  public final static native int x_button_clicked();
  public final static native int y_button_clicked();
  public final static native int z_button_clicked();
  public final static native int side_button_clicked();
  public final static native int any_button();
  public final static native void extra_buttons_show();
  public final static native void extra_buttons_hide();
  public final static native int get_extra_buttons_visible();
  public final static native void set_extra_buttons_visible(int jarg1);
  public final static native int digital(int jarg1);
  public final static native void set_digital_value(int jarg1, int jarg2);
  public final static native int get_digital_value(int jarg1);
  public final static native void set_digital_output(int jarg1, int jarg2);
  public final static native int get_digital_output(int jarg1);
  public final static native int get_digital_pullup(int jarg1);
  public final static native void set_digital_pullup(int jarg1, int jarg2);
  public final static native void pixel_r_set(long jarg1, pixel jarg1_, int jarg2);
  public final static native int pixel_r_get(long jarg1, pixel jarg1_);
  public final static native void pixel_g_set(long jarg1, pixel jarg1_, int jarg2);
  public final static native int pixel_g_get(long jarg1, pixel jarg1_);
  public final static native void pixel_b_set(long jarg1, pixel jarg1_, int jarg2);
  public final static native int pixel_b_get(long jarg1, pixel jarg1_);
  public final static native long new_pixel();
  public final static native void delete_pixel(long jarg1);
  public final static native int camera_open(int jarg1);
  public final static native int camera_open_device(int jarg1, int jarg2);
  public final static native int camera_load_config(String jarg1);
  public final static native void set_camera_width(int jarg1);
  public final static native void set_camera_height(int jarg1);
  public final static native int get_camera_width();
  public final static native int get_camera_height();
  public final static native int camera_update();
  public final static native long get_camera_pixel(long jarg1, point2 jarg1_);
  public final static native int get_channel_count();
  public final static native int get_object_count(int jarg1);
  public final static native String get_object_data(int jarg1, int jarg2);
  public final static native int get_code_num(int jarg1, int jarg2);
  public final static native int get_object_data_length(int jarg1, int jarg2);
  public final static native double get_object_confidence(int jarg1, int jarg2);
  public final static native int get_object_area(int jarg1, int jarg2);
  public final static native long get_object_bbox(int jarg1, int jarg2);
  public final static native long get_object_centroid(int jarg1, int jarg2);
  public final static native long get_object_center(int jarg1, int jarg2);
  public final static native void camera_close();
  public final static native void point2_x_set(long jarg1, point2 jarg1_, int jarg2);
  public final static native int point2_x_get(long jarg1, point2 jarg1_);
  public final static native void point2_y_set(long jarg1, point2 jarg1_, int jarg2);
  public final static native int point2_y_get(long jarg1, point2 jarg1_);
  public final static native long new_point2();
  public final static native void delete_point2(long jarg1);
  public final static native void rectangle_ulx_set(long jarg1, rectangle jarg1_, int jarg2);
  public final static native int rectangle_ulx_get(long jarg1, rectangle jarg1_);
  public final static native void rectangle_uly_set(long jarg1, rectangle jarg1_, int jarg2);
  public final static native int rectangle_uly_get(long jarg1, rectangle jarg1_);
  public final static native void rectangle_width_set(long jarg1, rectangle jarg1_, int jarg2);
  public final static native int rectangle_width_get(long jarg1, rectangle jarg1_);
  public final static native void rectangle_height_set(long jarg1, rectangle jarg1_, int jarg2);
  public final static native int rectangle_height_get(long jarg1, rectangle jarg1_);
  public final static native long new_rectangle();
  public final static native void delete_rectangle(long jarg1);
  public final static native long create_point2(int jarg1, int jarg2);
  public final static native long create_rectangle(int jarg1, int jarg2, int jarg3, int jarg4);
  public final static native short accel_x();
  public final static native short accel_y();
  public final static native short accel_z();
  public final static native int accel_calibrate();
  public final static native int analog10(int jarg1);
  public final static native int analog(int jarg1);
  public final static native void set_analog_pullup(int jarg1, int jarg2);
  public final static native int get_analog_pullup(int jarg1);
  public final static native int battery_charging();
  public final static native float power_level();
  public final static native void shut_down_in(double jarg1);
  public final static native void wait_for_light(int jarg1);
  public final static native void Rgb_r_set(long jarg1, Rgb jarg1_, short jarg2);
  public final static native short Rgb_r_get(long jarg1, Rgb jarg1_);
  public final static native void Rgb_g_set(long jarg1, Rgb jarg1_, short jarg2);
  public final static native short Rgb_g_get(long jarg1, Rgb jarg1_);
  public final static native void Rgb_b_set(long jarg1, Rgb jarg1_, short jarg2);
  public final static native short Rgb_b_get(long jarg1, Rgb jarg1_);
  public final static native long new_Rgb();
  public final static native void delete_Rgb(long jarg1);
  public final static native void Hsv_h_set(long jarg1, Hsv jarg1_, short jarg2);
  public final static native short Hsv_h_get(long jarg1, Hsv jarg1_);
  public final static native void Hsv_s_set(long jarg1, Hsv jarg1_, short jarg2);
  public final static native short Hsv_s_get(long jarg1, Hsv jarg1_);
  public final static native void Hsv_v_set(long jarg1, Hsv jarg1_, short jarg2);
  public final static native short Hsv_v_get(long jarg1, Hsv jarg1_);
  public final static native long new_Hsv();
  public final static native void delete_Hsv(long jarg1);
  public final static native void console_clear();
  public final static native int create_connect();
  public final static native void create_disconnect();
  public final static native void create_start();
  public final static native void create_passive();
  public final static native void create_safe();
  public final static native void create_full();
  public final static native void create_spot();
  public final static native void create_cover();
  public final static native void create_demo(int jarg1);
  public final static native void create_cover_dock();
  public final static native int get_create_mode();
  public final static native int get_create_lbump();
  public final static native int get_create_rbump();
  public final static native int get_create_lwdrop();
  public final static native int get_create_cwdrop();
  public final static native int get_create_rwdrop();
  public final static native int get_create_wall();
  public final static native int get_create_lcliff();
  public final static native int get_create_lfcliff();
  public final static native int get_create_rfcliff();
  public final static native int get_create_rcliff();
  public final static native int get_create_vwall();
  public final static native int get_create_overcurrents();
  public final static native int get_create_infrared();
  public final static native int get_create_advance_button();
  public final static native int get_create_play_button();
  public final static native int get_create_normalized_angle();
  public final static native void set_create_normalized_angle(int jarg1);
  public final static native int get_create_total_angle();
  public final static native void set_create_total_angle(int jarg1);
  public final static native int get_create_distance();
  public final static native void set_create_distance(int jarg1);
  public final static native int get_create_battery_charging_state();
  public final static native int get_create_battery_voltage();
  public final static native int get_create_battery_current();
  public final static native int get_create_battery_temp();
  public final static native int get_create_battery_charge();
  public final static native int get_create_battery_capacity();
  public final static native int get_create_wall_amt();
  public final static native int get_create_lcliff_amt();
  public final static native int get_create_lfcliff_amt();
  public final static native int get_create_rfcliff_amt();
  public final static native int get_create_rcliff_amt();
  public final static native int get_create_bay_DI();
  public final static native int get_create_bay_AI();
  public final static native int get_create_song_number();
  public final static native int get_create_song_playing();
  public final static native int get_create_number_of_stream_packets();
  public final static native int get_create_requested_velocity();
  public final static native int get_create_requested_radius();
  public final static native int get_create_requested__right_velocity();
  public final static native int get_create_requested_left_velocity();
  public final static native void create_stop();
  public final static native void create_drive(int jarg1, int jarg2);
  public final static native void create_drive_straight(int jarg1);
  public final static native void create_spin_CW(int jarg1);
  public final static native void create_spin_CCW(int jarg1);
  public final static native void create_drive_direct(int jarg1, int jarg2);
  public final static native void create_advance_led(int jarg1);
  public final static native void create_play_led(int jarg1);
  public final static native void create_power_led(int jarg1, int jarg2);
  public final static native void create_load_song(int jarg1);
  public final static native void create_play_song(int jarg1);
  public final static native void datalog_remove_category(String jarg1);
  public final static native void datalog_append_string(String jarg1, String jarg2);
  public final static native void datalog_append_number(double jarg1, String jarg2);
  public final static native void datalog_remove(int jarg1, String jarg2);
  public final static native int datalog_write_plain(String jarg1);
  public final static native int datalog_write_csv(String jarg1);
  public final static native void datalog_clear();
  public final static native void debug_print_registers();
  public final static native int register_value(int jarg1);
  public final static native int debug_dump_data(long jarg1, long jarg2, String jarg3);
  public final static native void display_clear();
  public final static native void display_printf(int jarg1, int jarg2, String jarg3);
  public final static native int draw_open();
  public final static native void draw_point(int jarg1, int jarg2);
  public final static native void draw_line(int jarg1, int jarg2, int jarg3, int jarg4);
  public final static native void draw_clear();
  public final static native void draw_close();
  public final static native void set_auto_publish(int jarg1);
  public final static native void publish();
  public final static native void halt();
  public final static native void freeze_halt();
  public final static native void ir_read();
  public final static native void ir_write();
  public final static native void msleep(int jarg1);
  public final static native long systime();
  public final static native double seconds();
}
