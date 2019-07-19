# course 0 - understand shell

The shell is the CLI (Command Line Interface), it works with command. For open it you must to search
in your computer for `Terminal`, and open it.  

## set 0 - how looks

The shell looks like this:

```
hostname:~ username$
```

The mouse is not allowed, you can just use your keyboard for write commands.

All the commands have a similar syntax:

```
command [<parameters> [<parameters> [...]]]
```

If you insert an `#` all the following code will never be executed. This practice is called comment
a line, is used for inser a comment in between your lines of code or commands.

## set 1 - file system

All the UNIX based file systems have a similar tree structure:

![UNIX File system](img/set1/file-system.gif)

The top of the tree is called `root directory`, root of the disk, every step down you must insert an
`/` in between the names of the directories, like `/home/sue/Pictures/pets/fido.jpg`.

On each directory or file, there are some permissions, they are about the owner of the file, the
group owner and everybody, for one of this permissions kind you can chose the if he can `read`,
`write` and `execute`.

If you want to indicate the local folder where you are you can use the `.` to indicate relative path
that mean that the path must be relative from your actual position. Otherwise you can use a `/` and
you must to insert the path from the root directory.

If you are in an subdirectory and you want to return up you one level, you must to use `..` instead
of the name of the folder. So if you are in the folder `pets` and you want to go up to the folder
`Pictures` you use `../`, and if you want to go in the directory `sue` you must use `../..`.

## set 2 - directory

An directory is a folder, the same folder that are on the desktop environment are also available on
the shell.

Your home directory (the folder where you have all your data) is an sub directory of the directory
`/home` (on Mac OS X `/Users`). Your home directory is `/home/<username>` (or `/Users/<username>`).  
The home directory is also represented by the character `~`.

### moving

Moving around folders as you do with the mouse with the graphical interface, on the shell works at
the same way, bu instead using the mouse you should use some commands.

#### List files and directories

`ls`

For display the files and the folders in your actual folder there is the command `ls`.

Usage:

```
ls [parameters] [list_folder_path]
```

If you left the `list_folder_path` parameters blank it will automatically list the actual folder.

If you want to see hidden files yum must use the `-a` argument, and if you want see the permissions
on the folder and files you must use the `-l` argument.

The `ls` command accepts relative and absolute paths

```
ls / # will list the root directory
# or
ls ../ # will list the father directory
```

#### change directory

`cd`

For change directory you must use the `cd` command, it require an destination folder, that can be
relative or absolute.

```
cd /home/sue/Pictures/pets          # result: ~/Pictures/pets
cd ../../                           # result: ~/
```

#### actual path

`pwd`

The pwd command will return the actual path.

#### open file

`open .`

On Mac OS is available the command `open` that can open (with the default program) the file, for
example `open ~/Pictures/pets/fido.jpg` will be opened with the preview program.

#### create folder

`mkdir`

The `mkdir` command will create a directory, it require the path of the new folder and also in this
case the path can be a relative or absolute path.

#### remove folder

`rmdir`

For remove a folder there is the command `rmdir`, and it works as the `mkdir`. It can be also
replaced by the command  `rm` with the parameter `r` (that can work also for files).

```
rmdir ~/Pictures
rm -r ~/Pictures
```

#### copy folders (or files)

`cp`

For copy a directory (or a file) you can use the command `cp`, if you want to copy a directory you
must insert the parameter `r` and you must provide the source file and the destination file.

```
cp -r <source_path> <destination_path>
```

#### moving folders (or files)

`mv`

For move an directory (or file) you must to use the command `mv` that works like the `mv` command,
but it doesn't require the `r` parameter.

```
mv <source_path> <destination_path>
```

## set 3 - files

In UNIX a lot of files are text files, with many different extensions, like ".txt", ".java" and so on.
So you will need a command line editor, the best one is _vim_, for use it there is a course, directly
developed by the vim developers community. Write the command `vimtutor` in the shell and do the whole 
course.

Linux files are offen managed with the same command of directories, like move, copy...  
But some actions are different.

#### create a file

`touch`

For create a file you must use the command `touch`, it requires the path of the file. This will create
an empty file.

```
touch documents/textFile.txt
```

#### delete a file

`rm`

For delete a file you must use the command `rm`, it requires the path of the file to delete.

```
rm documents/textFile.txt
```

It can also used for delete many files in one time.

```
rm documents/textFile.txt documents/textFile2.txt downloads/download.bin
```

## set 4 - file system advanced

UNIX is famous for his multi users environment, with many users on a single machine, you need permissions
on files and folders, who can read, write and execute what. Those just listed are the kinds of 
permissions and can be assigned to a single user, a group of users or to everybody. 

For show the permissions of the files (and directories) you must use the command `ls` with the parameter
`-l` (or `-la` for show also hidden files or directories). The command will return something like that: 

```
[user@host ~]$ ls -l
total 0
drwx------+  5 user staff   160 Jun 29 15:00 Desktop
drwx------+  5 user staff   160 Jun 22 18:58 Documents
drwx------+  4 user staff   128 May 31 21:47 Downloads
drwxrwxrwx+  4 user staff   128 Jan  9  2018 Movies
drwxrwx---+  4 user staff   128 Jul 13  2017 Music
drwx------+ 10 user staff   320 May 31 18:53 Pictures
```

At the begin of the row you can see the permissions. Them are divided in 4 block, the first indicate if
it's a direcotory or not (`d` is a directory, `-` is a file). Then there are 3 blocks of 3 charcers, the
first indicate the permissions of the user owner of the file, the second indicate the group owner of the 
file and the third indicate everybody.  
In each section (of the last three) there is a `rwx`, or `-`. If there is the letter, it means that the 
permission is allowed, the `r` means read, the `w` means write and the `x` execute.  
This three permission can be set to the owner (a user) of the file, to a group owner of the file (could 
be any user, also if the owner of the file is not in this group) and everybody.

## set 5 - disk utils

`du`

With the shell is also possible to analyze the size of the files and directories, witht the command
`du`, using it the with the parameters `-s -h`.

```
du -sh ~/Pictures
```

The command will return the size of the folder.

