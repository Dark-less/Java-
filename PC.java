package package1;

public class PC {
	CPU CPU;
	HardDisk HD;
	public void setCPU(CPU c) {
		this.CPU = c;
	}
	public void setHardDisk(HardDisk h) {
		this.HD = h;
	}
	public void show() {
		System.out.println("CPUÀŸ∂»"+CPU.getspeed());
		System.out.println("”≤≈Ã»›¡ø"+HD.getAmount());
	}

}
