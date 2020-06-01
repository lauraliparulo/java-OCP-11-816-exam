package de.demo.process;

import java.util.stream.Stream;

public class TestProcessHandle {

	public static void main(String[] args) {
		System.out.println("PID: " + ProcessHandle.current().pid());
		System.out.println("Info: " + ProcessHandle.current().info());
		System.out.println("Command: " + ProcessHandle.current().info().command());
		System.out.println("CPU-Usage: " + ProcessHandle.current().info().totalCpuDuration());

		System.out.println("----");

		showInfoForAllProcess();
	}

	private static void showInfoForAllProcess() {
		ProcessHandle.allProcesses().forEach(processHandle -> {

			final Stream<ProcessHandle> children = processHandle.children();

			final long count = children.count();

			if (count > 0) {
				System.out.println("Info: " + processHandle.info() + "has " + count + " children");

			}

		});

	}
}
