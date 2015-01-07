package com.tcmhealth.tcmhealth;

import java.util.List;

public interface ServerListener 
{
	void serverDataArrived(List list, boolean isEnd);
}
