class kw_os {
	fun ext(Int status) { exit(status) }
	fun ret(Boolean return_status) { return return_status }
	fun create_directory(String name_directory_create) { File.mkdir(name_directory_create); }
	fun remove_directory(String name_directory_remove) { File.rmdir(name_directory_remove); }
	fun systemd(name_command: String):Int { Runtime.getRuntime().exec(name_command); }
}
