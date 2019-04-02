package mp.rage.api.checkpoint.event

import mp.rage.api.checkpoint.Checkpoint
import mp.rage.api.event.AbstractEvent

abstract class CheckpointEvent(checkpoint : Checkpoint) : AbstractEvent()